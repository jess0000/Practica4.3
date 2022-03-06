package reviewsMain;

public class User {
    protected String nombre;
    protected String passworld;

    public User(String nombre, String passworld) {
        this.nombre = nombre;
        this.passworld = passworld;
    }

    public String getNombre() {return nombre;}
    public String getPassworld() {return passworld;}
}
