package traz_aqui;

public class Transportadora extends User {
    private static final double taxapeso = 0.5;
    private double custoKM;
    private double raio;
    private int nif;
    private double avaliacao;
    private double numreviews;
    
/*
    private ArrayList<traz_aqui.Encomenda> encomenda;
    private ArrayList<traz_aqui.Encomenda> historico; */


    /**
     * COnstrutor para objetos da classe traz_aqui.Transportadora
     */
    public Transportadora() {
        super();
        this.custoKM = 0;
        this.raio = 0;
        this.nif = 0;
        this.avaliacao = 0;
        this.numreviews = 0;


    }

    public Transportadora(String username, String codigo, String password, double locationX,
                          double locationY, String email, double custoKM, double raio, int nif, double aval, double numrev) {
        super(username, codigo, password, locationX, locationY, email);
        this.custoKM = custoKM;
        this.raio = raio;
        this.nif = nif;
        this.avaliacao = aval;
        this.numreviews = numrev;
    }

    public Transportadora(Transportadora p) {
        super(p.getUserName(), p.getPassword(), p.getCodigo(), p.getLocationX(), p.getLocationY(), p.getEmail());
        this.custoKM = p.getcustoKM();
        this.raio = p.getraio();
        this.nif = p.getnif();
        this.numreviews = p.getnumreviews();
        this.avaliacao = p.getavaliacao();


    }

    public void setnumreviews(double x) {
        this.numreviews = x;
    }

    public double getnumreviews() {
        return this.numreviews;
    }

    public double gettaxapeso() {
        return taxapeso;
    }


    public void setavaliacao(double x) {
        this.avaliacao = x;
    }

    public double getavaliacao() {
        return this.avaliacao;
    }

    public double getcustoKM() {
        return this.custoKM;
    }

    public void setcustoKM(double custoKM) {
        this.custoKM = custoKM;
    }

    public double getraio() {
        return this.raio;
    }

    public void setraio(int raio) {
        this.raio = raio;
    }

    public int getnif() {
        return this.nif;
    }

    public void setnif(int nif) {
        this.nif = nif;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Transportadora c = (Transportadora) o;
        return super.equals(c);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString() +
                this.custoKM +
                this.raio +
                this.nif +
                this.avaliacao +
                this.numreviews;
    }


    public Transportadora clone() {
        return new Transportadora(this);
    }
    
    
    
    
    /*
    public void PrintHist(){         
        for(traz_aqui.Encomenda a : this.historico){
            String buyer= a.getBuyer().getUserName();
            String store=a.getLoja().getUserName();
            System.out.println("traz_aqui.Buyer: " + buyer +",Store: " + store );
        }            
    }
    
    public double KmsPercurridos(){
        double totalKms =0;
        for(traz_aqui.Encomenda a : this.historico){
            traz_aqui.Buyer b = a.getBuyer();
            traz_aqui.Loja l = a.getLoja();
            double transtoloja = Math.sqrt(Math.pow(this.locationX - l.getLocationX(), 2) +
                     Math.pow(this.locationY - l.getLocationY(), 2));
            double lojatoBuyer = Math.sqrt(Math.pow(l.getLocationX() - b.getLocationX(), 2) +
                     Math.pow(l.getLocationY() - b.getLocationY(), 2));
            totalKms= totalKms + lojatoBuyer+transtoloja;
        }
        return totalKms; 
    }
    //---------------------------------------------------
    public double faturacao(LocalDate d1, LocalDate d2){
        double total=0;
        for(traz_aqui.Encomenda a : this.historico){
          if(a.getData().isAfter(d1) && a.getData().isBefore(d2) ){
              //total = inserir preço da encomenda aqui ------------------------------
            }
        }
        return total;
    }*/


    public String stringtoFile() {


        return ("traz_aqui.Voluntario:" + this.getCodigo() +
                "," + this.getPassword() +
                "," + this.getUserName() +
                "," + this.getLocationX() +
                "," + this.getLocationY() +
                "," + this.getEmail() +
                "," + this.getraio() +
                "," + this.getcustoKM() +
                "," + this.getnumreviews() +
                "," + this.getavaliacao());
    }

}