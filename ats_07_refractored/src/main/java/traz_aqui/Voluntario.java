package traz_aqui;

public class Voluntario extends User {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean livre;
    private double raio;
    private double avaliacao;
    private double numreviews;


    //private ArrayList<traz_aqui.Encomenda> historico;

    /**
     * COnstrutor para objetos da classe traz_aqui.Voluntario
     */
    public Voluntario() {
        super();
        this.livre = true;
        this.raio = 0;
        this.avaliacao = 0;
        this.numreviews = 0;

        //this.historico = new ArrayList<>() ;
    }

    public Voluntario(String username, String codigo, String password, double locationX,
                      double locationY, String email, double raio, boolean livre, double numr, double aval) {
        super(username, codigo, password, locationX, locationY, email);
        this.livre = livre;
        this.raio = raio;
        this.numreviews = numr;
        this.avaliacao = aval;
    }

    public Voluntario(Voluntario p) {
        super(p.getUserName(), p.getPassword(), p.getCodigo(), p.getLocationX(), p.getLocationY(), p.getEmail());
        this.numreviews = p.getnumreviews();
        this.avaliacao = p.getavaliacao();
        this.raio = p.getraio();
        this.livre = p.getlivre();


    }


    public void setnumreviews(double x) {
        this.numreviews = x;
    }

    public double getnumreviews() {
        return this.numreviews;
    }

    public void setavaliacao(double x) {
        this.avaliacao = x;
    }

    public double getavaliacao() {
        return this.numreviews;
    }

    public double getraio() {
        return this.raio;
    }

    public void setraio(double raio) {
        this.raio = raio;
    }

    public boolean getlivre() {
        return this.livre;
    }

    public void setlivre(boolean livre) {
        this.livre = livre;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Voluntario c;
        c = (Voluntario) o;
        return super.equals(c);
    }

    public String toString() {
        return super.toString() +
                this.raio +
                this.livre +
                this.numreviews +
                this.avaliacao;
    }

    public Voluntario clone() {
        return new Voluntario(this);
    }

    public void menu() {
        System.out.println("Test traz_aqui.Voluntario menu:");
    }


    //  NOT THE DEFAULT FUNCTIONS
    // Voluntariado escolhe se aceita encomenda ou não
    /*
    public void recebeEnc(traz_aqui.Encomenda a ){
        System.out.println("Do you accept the order (yes, no):");
        a.toString();
        int breakp=0;
        Scanner myObj = new Scanner(System.in);
        
        while( breakp ==0){ 
         String res = myObj.nextLine().toLowerCase();
         if (res.equals("yes")){ this.encomenda = a.clone() ; this.livre= false; 
             this.historico.add(a.clone()); }
         else if(res.equals("no")){breakp =1;}
         else {System.out.println("Invalid Input, answer yes or no : ");}
        }
        return ; 
    }
    
     print historico
    public void PrintHist(){         
        for(traz_aqui.Encomenda a : this.historico){
            String buyer= a.getBuyer().getUserName();
            String store=a.getLoja().getUserName();
            System.out.println("traz_aqui.Buyer: " + buyer +",Store: " + store );
        }            
    }*/


    public String stringtoFile() {
        return ("traz_aqui.Voluntario:" + this.getCodigo() +
                "," + this.getPassword() +
                "," + this.getUserName() +
                "," + this.getLocationX() +
                "," + this.getLocationY() +
                "," + this.getEmail() +
                "," + this.getraio() +
                "," + this.getlivre() +
                "," + this.getnumreviews() +
                "," + this.getavaliacao());
    }


}