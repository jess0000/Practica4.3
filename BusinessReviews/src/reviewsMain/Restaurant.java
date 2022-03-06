package reviewsMain;

public class Restaurant extends Business{
    protected String tipoComida;

    public Restaurant(String nombre, String ubicacion, Review review, String tipoComida) {
        super(nombre, ubicacion, review);
        this.tipoComida = tipoComida;
    }

    public Restaurant(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {return tipoComida;}
    public void setTipoComida(String tipoComida) {this.tipoComida = tipoComida;}

    @Override
    public String toString() {
        return "Restaurant" + super.toString() +
                "- " + tipoComida + '\n' + "Review average: " + business.reviewAverage();
    }
}
