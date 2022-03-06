package reviewsMain;

public abstract class Business {// cambiar
    public String nombre;
    public String ubicacion;
    Review review = new Review();

    public Business(String nombre, String ubicacion, Review review) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.review = review;
    }

    public Business() {
        this.nombre = "";
        this.ubicacion = "";
    }

    public double reviewAverage(){
        Review[] reviews = new Review[10];
        double media = 0;
        for (int i = 0; i < reviews.length; i++)
            media += reviews[i].getCalificacion();
        media /= reviews.length;
        return media;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getUbicacion() {return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

    public Review getReview() {return review;}

    Business business;
    @Override
    public String toString() {
        return nombre + " (" + ubicacion + ") ";
    }
}
