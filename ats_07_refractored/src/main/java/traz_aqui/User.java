package traz_aqui;

public abstract class User {
    protected String username;
    protected String password;
    protected Double locationX;
    protected Double locationY;
    protected String codigo;
    protected String email;


    /**
     * COnstrutor para objetos da classe traz_aqui.User
     */

    public User() {
        this.username = this.codigo = this.password = this.email = "";
        this.locationX = 0.0;
        this.locationY = 0.0;
    }

    public User(String username, String codigo, String password, double locationX, double locationY, String email) {
        this.username = username;
        this.password = password;
        this.codigo = codigo;
        this.locationX = locationX;
        this.locationY = locationY;
        this.email = email;
    }

    public User(User p) {
        this.username = p.getUserName();
        this.password = p.getPassword();
        this.codigo = p.getCodigo();
        this.locationX = p.getLocationX();
        this.locationY = p.getLocationY();
        this.email = p.getEmail();
    }

    public String getEmail() {
        return this.email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return this.username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getLocationX() {
        return this.locationX;
    }

    public void setLocationX(double location) {
        this.locationX = location;
    }

    public double getLocationY() {
        return this.locationX;
    }

    public void setLocationY(double location) {
        this.locationY = location;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        User v = (User) obj;
        return this.getUserName().equals(v.getUserName()) &&
                this.getPassword().equals(v.getPassword()) &&
                this.getLocationX() == v.getLocationX() &&
                this.getLocationY() == v.getLocationY() &&
                this.getCodigo().equals(v.getCodigo()) &&
                this.getEmail().equals(v.getEmail());
    }

    public abstract User clone();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return (this.getUserName() +
                " " +
                this.getPassword() +
                " " +
                this.getLocationX() +
                " " +
                this.getLocationY() +
                " " +
                this.getCodigo() +
                " " +
                this.getEmail());
    }


    // FUNCTIONS THAT ARE NOT DEFAULT
    public abstract String stringtoFile();


}
