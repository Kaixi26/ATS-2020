package traz_aqui;

/**
 * Escreva a descrição da classe traz_aqui.Buyer aqui.
 *
 * @author (seu nome)
 * @version (número de versão ou data)
 */
public class Buyer extends User {

    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    /**
     * COnstrutor para objetos da classe traz_aqui.Buyer
     */
    public Buyer() {
        super();

    }

    public Buyer(String username, String codigo, String password, double locationX, double locationY, String email) {
        super(username, codigo, password, locationX, locationY, email);

    }

    public Buyer(Buyer p) {
        super(p);

    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Buyer c = (Buyer) o;
        return super.equals(c);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }


    public Buyer clone() {
        return new Buyer(this);
    }


    // NOT THE DEFAULT FUNCTIONS
    public String stringtoFile() {
        return ("Utilizador:" + this.getCodigo() +
                "," + this.getPassword() +
                "," + this.getUserName() +
                "," + this.getLocationX() +
                "," + this.getLocationY() +
                "," + this.getEmail());
    }


}
