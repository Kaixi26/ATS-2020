package traz_aqui;

import java.util.ArrayList;

public class Loja extends User {
    private static final double tempoAtendimento = 5; //em minutos se tiver teempo acabar
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean filadeEspera;
    private ArrayList<Encomenda> queue;


    public Loja() {
        super();


    }

    public Loja(String username, String codigo, String password, double locationX,
                double locationY, String email) {
        super(username, codigo, password, locationX, locationY, email);
        //this.filadeEspera=filadeEspera;

        //this.queue= new ArrayList<>();

    }

    public Loja(Loja p) {
        super(p.getUserName(), p.getPassword(), p.getCodigo(), p.getLocationX(), p.getLocationY(), p.getEmail());
        //this.filadeEspera= p.getfiladeEspera();
        //this.queue = p.getqueue();
    }

    public ArrayList<Encomenda> getqueue() {
        return this.queue;
    }

    public void setProdutos(ArrayList<Encomenda> queue) {
        this.queue = queue;
    }

    public boolean getfiladeEspera() {
        return this.filadeEspera;
    }

    public void setfiladeEspera(boolean filadeEspera) {
        this.filadeEspera = filadeEspera;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Loja c = (Loja) o;
        return super.equals(c);
    }

    public String toString() {
        return super.toString() +
                this.filadeEspera +
                tempoAtendimento;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Loja clone() {
        return new Loja(this);
    }

    public String stringtoFile() {
        return ("Utilizador:" + this.getCodigo() +
                "," + this.getPassword() +
                "," + this.getUserName() +
                "," + this.getLocationX() +
                "," + this.getLocationY() +
                "," + this.getEmail());
    }

}

