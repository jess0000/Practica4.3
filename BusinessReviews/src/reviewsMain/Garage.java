package reviewsMain;

public class Garage extends Business{
    protected float precioHora;

    public Garage(String nombre, String ubicacion, Review review, float precioHora) {
        super(nombre, ubicacion, review);
        this.precioHora = precioHora;
    }



    public float getPrecioHora() {return precioHora;}
    public void setPrecioHora(float precioHora) {this.precioHora = precioHora;}

    @Override
    public String toString() {
        return "Garage " + super.toString() + "- " + precioHora +
                " eur/h" + '\n' + "Review average: " + business.reviewAverage();
    }
}
