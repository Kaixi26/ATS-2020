package traz_aqui;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Controlador {

    private static final String TEXT_LOGIN = "Login";
    private static final String TEXT_SIGNUP = "Signup";
    private static final String TEXT_ASKEMAIL = "\nDigite o seu email: \n";
    private static final String TEXT_ASKPASS = "\nDigite a sua pass: \n";
    private static final String TEXT_ASKNAME = "\nDigite o seu nome: \n";
    private static final String TEXT_ASKCOORDS = "\nDigite as suas coordenadas: \n";
    private static final String TEXT_YESORNO = " ?(y/n)\n";
    private static final String TEXT_ASKXCOORD = "\"\\nX: \\n\"";
    private static final String TEXT_ASKYCOORD = "\"\\nY: \\n\"";
    private static final String TEXT_EMAILINUSE = "\"Erro email em uso no sistema.\"";
    private static final String TEXT_INCORRECTVALUE = "Valor Incorreto";
    private static final String TEXT_INCORRECTCREDENTIALS = "\nPassword ou Mail incorreto.";
    private static final String TEXT_NONCONFIRMEDDELIVERIES = "Encomendas a confirmar:";
    private static final String TEXT_SEEREGISTERS = "Ver Registos.";
    private static final String TEXT_SEEAREAEVENTS = "Ver os eventos na sua área.";

    private Gestor gestor;

    public Controlador() {
        this.gestor = new Gestor();
        this.gestor.loadCat();
        this.gestor.adicionaDef();
    }

    /**
     * Menu principal
     */
    public void menu() {
        List<String> s = new ArrayList<>(Arrays.asList("Modo User.", "Modo Voluntário.", "Modo Transportadora.", "Modo Loja.", "Os dez utilizadores que mais usam o sistema.", "As dez empresas que mais usam o sistema.", "Guardar e Ler estado."));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            if (op == 1) modoUser();
            else if (op == 2) modoVoluntario();
            else if (op == 3) modoEmpresa();
            else if (op == 4) modoLoja();
            else if (op == 5) topUsers();
            else if (op == 6) topTransp();
            else if (op == 7) lerGuardar();
        } while (op != 0);
        Viewer.prints("Goodbye");

    }

    /**
     * Método que faz print dos topUsers (case 5 do menu principal)
     */
    public void topUsers() {
        for (TopUsers t : this.gestor.topUsers()) Viewer.prints(t);
    }

    /**
     * Método que faz print dos topTransp (case 6 do menu principal)
     */
    public void topTransp() {
        List<TopUsers> top = this.gestor.topTransp();
        if (top.isEmpty())
            Viewer.prints("Nao há condições para realizar o pedido.");
        else for (TopUsers t : top) Viewer.prints("Driver: " + t.getCod() + " KmsPerc: " + t.getQnt());
    }

    /**
     * Método que pede ao utilizador o ficheiro que quer utilizar e chama o menu de guardar e ler objecto (case 7 do menu principal)
     */
    public void lerGuardar() {
        Viewer.prints("Nome do ficheiro que quer usar:\n");
        String fich = Input.lerString();
        menuObjStream(fich);
    }

    /**
     * Menu que nos permite fazer a escolha entre gravar e ler estado
     *
     * @param str Nome Ficheiro
     */
    public void menuObjStream(String str) {
        List<String> s = new ArrayList<>(Arrays.asList("Gravar", "Ler"));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    try {
                        writeEstado(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                        Viewer.prints("Não foi possível gravar");
                    }
                    break;
                case 2:
                    try {
                        this.gestor = loadEstado(str);
                    } catch (IOException e) {
                        Viewer.prints("Não foi possível ler");
                    } catch (ClassNotFoundException | ClassCastException e) {
                        Viewer.prints("Erro");
                    }
                    break;
                default:
            }
        } while (op != 0);
        menu();
    }

    /**
     * Menu do modo utilizador que permite fazer login ou sign up de um utilizador
     */
    public void modoUser() {
        List s = new ArrayList<>(Arrays.asList(TEXT_LOGIN, TEXT_SIGNUP));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    loginUser();
                    break;
                case 2:
                    signupUser();
                    break;
                default:
            }
        } while (op != 0);
    }

    /**
     * Menu do modo empresa que permite fazer login ou sign up de uma Transportadora
     */
    public void modoEmpresa() {
        List s = new ArrayList<>(Arrays.asList(TEXT_LOGIN, TEXT_SIGNUP));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    loginEmpresa();
                    break;
                case 2:
                    signupEmpresa();
                    break;
                default:
            }
        } while (op != 0);
    }

    /**
     * Menu do modo voluntário que permite fazer login ou sign up de um voluntário
     */
    public void modoVoluntario() {
        List s = new ArrayList<>(Arrays.asList(TEXT_LOGIN, TEXT_SIGNUP));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    loginVoluntario();
                    break;
                case 2:
                    signupVoluntario();
                    break;
                default:
            }
        } while (op != 0);
    }

    /**
     * Menu do modo loja que permite fazer login ou sign up de uma Loja
     */
    public void modoLoja() {
        List s = new ArrayList<>(Arrays.asList(TEXT_LOGIN, TEXT_SIGNUP));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    loginLoja();
                    break;
                case 2:
                    signupLoja();
                    break;
                default:
            }
        } while (op != 0);
    }

    /**
     * Menu do modo login de um utilizador
     */
    public void loginUser() {
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        String f = this.gestor.login(1, email, pass);
        if (f != null) alertasU(f);
        else {
            Viewer.prints(TEXT_INCORRECTCREDENTIALS);
            modoUser();
        }
    }

    /**
     * Menu do modo login de uma transportadora
     */
    public void loginEmpresa() {
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        String f = this.gestor.login(2, email, pass);
        if (f != null) alertasE(f);
        else {
            Viewer.prints(TEXT_INCORRECTCREDENTIALS);
            modoEmpresa();
        }
    }

    /**
     * Menu do modo login de um voluntário
     */
    public void loginVoluntario() {
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        String f = this.gestor.login(3, email, pass);
        if (f != null) alertasV(f);
        else {
            Viewer.prints(TEXT_INCORRECTCREDENTIALS);
            modoVoluntario();
        }
    }

    /**
     * Menu do modo login de uma loja
     */
    public void loginLoja() {
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        String f = this.gestor.login(4, email, pass);
        if (f != null) menuLoja(f);
        else {
            Viewer.prints(TEXT_INCORRECTCREDENTIALS);
            modoLoja();
        }
    }

    /**
     * Menu do modo sign up de um utilizador
     */
    public void signupUser() {
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        Viewer.prints(TEXT_ASKNAME);
        String nome = Input.lerString();
        Viewer.prints(TEXT_ASKCOORDS);
        Viewer.prints(TEXT_ASKXCOORD);
        double x = Input.lerDouble();
        Viewer.prints(TEXT_ASKYCOORD);
        double y = Input.lerDouble();
        String cod = this.gestor.geraCods(2);
        if (this.gestor.verificaMail(1, email)) {
            Viewer.prints(TEXT_EMAILINUSE);
            signupUser();
        } else this.gestor.registarUser(cod, nome, new Coordenadas(x, y), pass, email);
        alertasU(cod);
    }

    /**
     * Menu do modo sign up de uma Transportadora
     */
    public void signupEmpresa() {
        boolean med = false;
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        Viewer.prints(TEXT_ASKNAME);
        String nome = Input.lerString();
        Viewer.prints(TEXT_ASKCOORDS);
        Viewer.prints(TEXT_ASKXCOORD);
        double x = Input.lerDouble();
        Viewer.prints(TEXT_ASKYCOORD);
        double y = Input.lerDouble();
        Viewer.prints("\nDigite o seu range:\n");
        double range = Input.lerDouble();
        Viewer.prints("\nDigite o seu preço por km:\n");
        double prkm = Input.lerDouble();
        Viewer.prints("\nDigite o seu NIF:\n");
        double nif = Input.lerDouble();
        Viewer.prints("\nDigite a sua velocidade:\n");
        double vkm = Input.lerDouble();
        Viewer.prints("\nDigite a sua capacidade:\n");
        int cap = Input.lerInt();
        Viewer.prints("\nTem competências de transporte médico?(y/n):\n");
        String pri = Input.lerString();
        if (pri.equals("y") || pri.equals("Y")) med = true;
        else {
            Viewer.prints(TEXT_INCORRECTVALUE);
            signupEmpresa();
        }
        String cod = this.gestor.geraCods(1);
        if (this.gestor.verificaMail(2, email)) {
            Viewer.prints(TEXT_EMAILINUSE);
            signupEmpresa();
        } else
            this.gestor.registarEmpresa(cod, nome, new Coordenadas(x, y), range, prkm, nif, -1, med, vkm, email, pass, 0, cap);
        alertasE(cod);
    }

    /**
     * Menu do modo sign up de um voluntário
     */
    public void signupVoluntario() {
        boolean med = false;
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        Viewer.prints(TEXT_ASKNAME);
        String nome = Input.lerString();
        Viewer.prints(TEXT_ASKCOORDS);
        Viewer.prints(TEXT_ASKXCOORD);
        double x = Input.lerDouble();
        Viewer.prints(TEXT_ASKYCOORD);
        double y = Input.lerDouble();
        Viewer.prints("\nDigite o seu range:\n");
        double range = Input.lerDouble();
        Viewer.prints("\nDigite a sua velocidade:\n");
        double vkm = Input.lerDouble();
        Viewer.prints("\nTem compretências de transporte médico?(y/n):\n");
        String pri = Input.lerString();
        if (pri.equals("y") || pri.equals("Y")) med = true;
        else {
            Viewer.prints(TEXT_INCORRECTVALUE);
            signupVoluntario();
        }
        String cod = this.gestor.geraCods(3);
        if (this.gestor.verificaMail(3, email)) {
            Viewer.prints(TEXT_EMAILINUSE);
            signupVoluntario();
        } else this.gestor.registarVoluntario(cod, nome, range, new Coordenadas(x, y), -1, med, vkm, email, pass, 1);
        alertasV(cod);
    }

    /**
     * Menu do modo sign up de uma Loja
     */
    public void signupLoja() {
        int fila = -1;
        Viewer.prints(TEXT_ASKEMAIL);
        String email = Input.lerString();
        Viewer.prints(TEXT_ASKPASS);
        String pass = Input.lerString();
        Viewer.prints(TEXT_ASKNAME);
        String nome = Input.lerString();
        Viewer.prints(TEXT_ASKCOORDS);
        Viewer.prints(TEXT_ASKXCOORD);
        double x = Input.lerDouble();
        Viewer.prints(TEXT_ASKYCOORD);
        double y = Input.lerDouble();
        String cod = this.gestor.geraCods(4);
        Viewer.prints("\nSabe o tamanho médio da sua fila (y/n): \n");
        String fil = Input.lerString();
        if (fil.equals("y") || fil.equals("Y")) {
            Viewer.prints("\nTamanho da fila: \n");
            fila = Input.lerInt();
        } else if (fil.equals("n") || fil.equals("N")) fila = -1;
        else {
            Viewer.prints(TEXT_INCORRECTVALUE);
            signupLoja();
        }

        if (this.gestor.verificaMail(4, email)) {
            Viewer.prints(TEXT_EMAILINUSE);
            signupLoja();
        } else this.gestor.registarLoja(cod, nome, new Coordenadas(x, y), fila, email, pass);
        menuLoja(cod);
    }

    /**
     * Menu de todos os alertas que possam ser feitos ao modo utilizador desde confirmação de encomendas, transporte e classificações
     *
     * @param cod Código Utilizador
     */
    public void alertasU(String cod) {
        int i = 1;
        List<Registos> a = this.gestor.histReg(cod, 1);
        if (!a.isEmpty()) {
            Viewer.prints(TEXT_NONCONFIRMEDDELIVERIES);
            for (Registos r : a) {
                if (r.getDriver().charAt(0) == 't')
                    Viewer.prints((i) + ") " + "Transportadora: " + r.getDriver() + " Custo de Transporte previsto: " + r.getCustoT() + " Tempo de encomenda previsto: " + r.getTmp());
                if (r.getDriver().charAt(0) == 'v')
                    Viewer.prints((i) + ") " + "Voluntario: " + r.getDriver() + " Custo de Transporte previsto: " + r.getCustoT() + " Tempo de encomenda previsto: " + r.getTmp());
                i++;
            }
            for (i = 0; i < a.size(); i++) {
                Viewer.prints("Pretende aceitar o transporte " + (i + 1) + TEXT_YESORNO);
                String res = Input.lerString();
                this.gestor.aumCap(a.get(i).getDriver());
                if (res.equals("y") || res.equals("Y"))
                    this.gestor.getItDone(a.get(i).getEnc().getCod(), a.get(i).getLoja(), a.get(i).getUser(), a.get(i).getDriver(), a.get(i).getTmp());
                else if (res.equals("n") || res.equals("N")) this.gestor.declinedT(a.get(0));
                else alertasU(cod);
            }
        }
        List<Registos> g = this.gestor.histReg(cod, 3);
        i = 1;
        if (!g.isEmpty()) {
            Viewer.prints("Entregas a classificar");
            for (Registos f : g) {
                if (f.getDriver().charAt(0) == 't')
                    Viewer.prints((i) + ") " + "Transportadora: " + f.getDriver() + " Custo de encomenda: " + (f.getEnc().custo() + f.getCustoT()));
                if (f.getDriver().charAt(0) == 'v')
                    Viewer.prints((i) + ") " + "Voluntario: " + f.getDriver() + " Custo de encomenda: " + (f.getEnc().custo() + f.getCustoT()));
                i++;
            }
            for (i = 0; i < g.size(); i++) {
                Viewer.prints("Como classifica a entrega " + (i + 1) + " de (1 a 10):");
                double clas = Input.lerDouble();
                if (clas < 0 || clas > 10) alertasU(cod);
                else this.gestor.classifica(g.get(i), clas);
            }
        }
        menuUser(cod);
    }

    /**
     * Menu de todos os alertas que possam ser feitos ao modo transportadora como confirmação de encomenda
     *
     * @param cod Código Transportadora
     */
    public void alertasE(String cod) {
        int i = 1;
        List<Registos> a = this.gestor.histReg(cod, 4);
        if (!a.isEmpty()) {
            Viewer.prints(TEXT_NONCONFIRMEDDELIVERIES);
            for (Registos r : a) {
                Viewer.prints((i) + ") " + "User: " + r.getUser() + " - " + r.getEnc());
                i++;
            }
            gestorViewerE(cod, a);
        }
        menuEmpresa(cod);
    }

    private void gestorViewerE(String cod, List<Registos> a) {
        int i;
        for (i = 0; i < a.size(); i++) {
            if (this.gestor.getCap(cod) == 0) {
                Viewer.prints((i + 1) + " - Não tem capacidade para realizar a encomenda\n");
                this.gestor.declinedT(a.get(i));
            } else {
                Viewer.prints("Pretende aceitar a encomenda " + (i + 1) + TEXT_YESORNO);
                String res = Input.lerString();
                if (res.equals("y") || res.equals("Y")) {
                    this.gestor.avanca(a.get(i));
                    this.gestor.dimCap(cod);
                } else if (res.equals("n") || res.equals("N")) this.gestor.declinedT(a.get(i));
                else alertasE(cod);
            }
        }
    }

    /**
     * Menu de todos os alertas que possam ser feitos ao modo voluntário como confirmação de encomenda
     *
     * @param cod Código Voluntário
     */
    public void alertasV(String cod) {
        int i = 1;
        List<Registos> a = this.gestor.histReg(cod, 4);
        if (!a.isEmpty()) {
            Viewer.prints(TEXT_NONCONFIRMEDDELIVERIES);
            for (Registos r : a) {
                Viewer.prints((i) + ") " + "User: " + r.getUser() + " - " + r.getEnc());
                i++;
            }
            for (i = 0; i < a.size(); i++) {
                if (this.gestor.getCap(cod) == 0) {
                    Viewer.prints((i + 1) + " - Não tem capacidade para realizar a encomenda\n");
                    this.gestor.declinedT(a.get(i));
                } else {
                    Viewer.prints("Pretende aceitar a encomenda " + (i + 1) + TEXT_YESORNO);
                    String res = Input.lerString();
                    if (res.equals("y") || res.equals("Y")) {
                        this.gestor.avanca(a.get(i));
                        this.gestor.dimCap(cod);
                    } else if (res.equals("n") || res.equals("N")) this.gestor.declinedT(a.get(i));
                    else alertasV(cod);
                }
            }
        }
        menuVoluntario(cod);
    }

    /**
     * Menu de Utilizador, são dadas as opcões de fazer uma encomenda, ver os registos e ver eventos
     *
     * @param cod Código Utilizador
     */
    public void menuUser(String cod) {
        Viewer.prints("\nUtilizador: " + cod + ".");
        Utilizador u = this.gestor.procUtil(cod);
        List s = new ArrayList<>(Arrays.asList("Fazer Encomenda.", TEXT_SEEREGISTERS, TEXT_SEEAREAEVENTS));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    fazerEncomenda(u.getCord(), u.getNome(), cod);
                    break;
                case 2:
                    verRegistos(cod);
                    break;
                case 3:
                    verEventos(u.getCord());
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

    /**
     * Método que cria uma nova encomenda se assim for possível
     *
     * @param a    Coordenadas
     * @param nome Nome Utilizador
     * @param cod  Código
     */
    public void fazerEncomenda(Coordenadas a, String nome, String cod) {
        int i = 0;
        int f = 1;
        boolean still = true;
        boolean pr = false;
        Viewer.prints("\nA que distância máxima de uma loja (em km) pretende procurar?\n");
        int dist = Input.lerInt();
        Viewer.prints("\nLojas a " + dist + " km de si:\n");
        List<Loja> lojas = this.gestor.getLojasinRange(a, dist);
        if (lojas.isEmpty()) {
            Viewer.prints("Nehuma loja encontrada em range.");
            menuUser(cod);
        }
        for (Loja g : lojas) {
            Viewer.prints(f + ") " + g.getNome());
            f++;
        }
        Viewer.prints("\nDe qual loja pretende encomendar (use o index)?\n");
        int ind = Input.lerInt();
        Encomenda enc = new Encomenda(this.gestor.geraCods(0), nome, lojas.get(ind - 1).getCod(), 0);
        while (still) {
            Viewer.prints("\nPretende comprar um produto de prioridade? (y/n)\n");
            String pri = Input.lerString();
            if (pri.equals("y") || pri.equals("Y")) pr = true;
            else if (pri.equals("n") || pri.equals("N")) pr = false;
            else fazerEncomenda(a, nome, cod);
            Viewer.prints("\nQual produto pretende comprar?\n");
            String prod = Input.lerString();
            Viewer.prints("\nQual quantidade quer comprar?\n");
            double qnt = Input.lerDouble();
            enc.adicionaLEnco(new LinhaEncomenda(Integer.toString(i), prod, qnt, ThreadLocalRandom.current().nextDouble(1, 999)));
            i++;
            enc.setPeso(enc.getPeso() + qnt);
            Viewer.prints("\nQuer realizar mais compras? (y/n)\n");
            String ts = Input.lerString();
            if (ts.equals("n") || ts.equals("N")) still = false;
        }
        List<StringDistAux> m = this.gestor.getBestLoja(lojas.get(ind - 1).getCord(), a, pr);
        if (m.isEmpty()) Viewer.prints("Não é possivel realizar a encomenda (não existe meios de transporte)");
        else {
            this.gestor.gestaoEncomenda(enc, cod, m);
            this.gestor.registarEnc(enc);
            Viewer.prints("Custo de encomenda (antes de transportes): " + enc.custo());
        }
        menuUser(cod);
    }

    /**
     * Menu de Empresa, são dadas as opcões de ver registos, classificações, eventos e total facturado num intervalo
     *
     * @param cod Código Transportadora
     */
    public void menuEmpresa(String cod) {
        Viewer.prints("\nTransportadora: " + cod + ".");
        List s = new ArrayList<>(Arrays.asList(TEXT_SEEREGISTERS, "Ver Classificação.", TEXT_SEEAREAEVENTS, "Ver total facturado num período de tempo."));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    verRegistos(cod);
                    break;
                case 2:
                    verClas(cod);
                    break;
                case 3:
                    verEventos(this.gestor.getCoord(cod));
                    break;
                case 4:
                    factTempo(cod);
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

    /**
     * Menu de Voluntário, são dadas as opcões ver os registos,eventos e classificação
     *
     * @param cod Código Voluntário
     */
    public void menuVoluntario(String cod) {
        Viewer.prints("\nVoluntário: " + cod + ".");
        List s = new ArrayList<>(Arrays.asList(TEXT_SEEREGISTERS, "Ver Classificação.", TEXT_SEEAREAEVENTS));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    verRegistos(cod);
                    break;
                case 2:
                    verClas(cod);
                    break;
                case 3:
                    verEventos(this.gestor.getCoord(cod));
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

    /**
     * Menu de Loja, são dadas as opcões ver os registos e eventos
     *
     * @param cod Código Loja
     */
    public void menuLoja(String cod) {
        Viewer.prints("\nLoja: " + cod + ".");
        List s = new ArrayList<>(Arrays.asList(TEXT_SEEREGISTERS, TEXT_SEEAREAEVENTS));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    verRegistos(cod);
                    break;
                case 2:
                    verEventos(this.gestor.getCoord(cod));
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

    /**
     * Menu de Registos com a possibilidade de se ver as listas dos diferentes estados de Registos
     *
     * @param cod Código
     */
    public void verRegistos(String cod) {
        Viewer.prints("Qual histórico de encomendas pretende ver?");
        List s = new ArrayList<>(Arrays.asList("Received.", "Terminated.", "Accepted.", "Pending.", "Finalized"));
        Menu m = new Menu(s);
        int op;
        do {
            m.executa();
            op = m.opcao();
            switch (op) {
                case 1:
                    history(cod, 3);
                    break;
                case 2:
                    history(cod, 2);
                    break;
                case 3:
                    history(cod, 1);
                    break;
                case 4:
                    history(cod, 4);
                    break;
                case 5:
                    history(cod, 5);
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }

    /**
     * Método que possibilita vermos o histórico de um utilizador, voluntário, empresa, loja no modo que desejarmos
     *
     * @param cod  Código
     * @param modo Modo
     */
    public void history(String cod, int modo) {
        int i;
        List<Registos> a = this.gestor.histReg(cod, modo);
        if (a.isEmpty()) Viewer.prints("Não existem elementos no histórico.");
        else {
            if (modo == 3 || modo == 5)
                a.forEach(x -> Viewer.prints(x.getData() + " - User: " + x.getUser() + " - Driver: " + x.getDriver() + " - Tempo: " + x.getTmp() + " - Custo: " + (x.getEnc().custo() + x.getCustoT()) + " - Enc: " + x.getEnc() + " - Custo transporte: " + x.getCustoT()));
            else a.forEach(x -> Viewer.prints(x.getData() + " - User: " + x.getUser() + " - Driver: " + x.getDriver()));
        }
        Viewer.prints("\n0) Voltar aos registos.");
        do {
            i = Input.lerInt();
        } while (i != 0);
        verRegistos(cod);
    }

    /**
     * Método que apresenta a classificação de uma transportadora ou voluntário dependendo do código dado
     *
     * @param cod Código Driver
     */
    public void verClas(String cod) {
        double i = this.gestor.getClas(cod);
        if (i == -1) Viewer.prints("Não classificado");
        else Viewer.prints("Classificação acumulada: " + i);
        Viewer.prints("\n0) Voltar ao Menu.");
        do {
            i = Input.lerInt();
        } while (i != 0);
    }

    /**
     * Método que apresenta todos os eventos que possam afetar o tempo de envio numa área
     *
     * @param c Coordenadas
     */
    public void verEventos(Coordenadas c) {
        int i;
        Viewer.prints("Eventos que possam afetar o tempo de envio (1-100)(melhor-pior): ");
        Viewer.prints("\nClima na sua área: " + this.gestor.getRando(c, 0));
        Viewer.prints("Trânsito na sua área: " + this.gestor.getRando(c, 1));
        Viewer.prints("\n0) Voltar ao menu.");
        do {
            i = Input.lerInt();
        } while (i != 0);
    }

    /**
     * Método que mostra a facturação total num intervalo
     *
     * @param cod Código Empresa
     */
    public void factTempo(String cod) {
        int i;
        Viewer.prints("Insira o periodo de tempo inicial");
        Viewer.prints("Ano:");
        int anoI = Input.lerInt();
        Viewer.prints("Dia:");
        int diaI = Input.lerInt();
        Viewer.prints("Mes:");
        int mesI = Input.lerInt();
        Viewer.prints("Horas:");
        int horasI = Input.lerInt();
        Viewer.prints("Minuto:");
        int minI = Input.lerInt();
        Viewer.prints("Insira o periodo de tempo final");
        Viewer.prints("Ano:");
        int anoF = Input.lerInt();
        Viewer.prints("Dia:");
        int diaF = Input.lerInt();
        Viewer.prints("Mes:");
        int mesF = Input.lerInt();
        Viewer.prints("Horas:");
        int horasF = Input.lerInt();
        Viewer.prints("Minuto:");
        int minF = Input.lerInt();

        LocalDateTime di = null;
        LocalDateTime df = null;

        try {
            di = LocalDateTime.of(anoI, mesI, diaI, horasI, minI);
            df = LocalDateTime.of(anoF, mesF, diaF, horasF, minF);
        } catch (DateTimeException e) {
            Viewer.prints("Data: Erro");
            factTempo(cod);
        }

        Viewer.prints("Faturacao total no periodo entre " + di + " e " + df);
        Viewer.prints(this.gestor.totalFact(cod, di, df));

        Viewer.prints("\n0) Voltar ao menu.");
        do {
            i = Input.lerInt();
        } while (i != 0);
        menuEmpresa(cod);
    }

    /**
     * Método responsável por gravar o estado atual do programa
     *
     * @param name Nome do ficheiro onde vamos gravar o estado
     */
    //Gravar Estado
    public void writeEstado(String name) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(this.gestor);
            oos.flush();
        }
    }

    /**
     * Método responsável por dar load do estado gravado
     *
     * @param name Nome do ficheiro em que foi gravado o estado
     */
    //Load Estado
    public Gestor loadEstado(String name) throws IOException, ClassNotFoundException {
        Gestor novo;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name))) {
            novo = (Gestor) ois.readObject();
        }
        return novo;
    }
}
