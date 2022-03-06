package reviewsMain;

public class Hairdresser extends Business{
    protected boolean unisex;

    public Hairdresser(String nombre, String ubicacion, Review review, boolean unisex) {
        super(nombre, ubicacion, review);
        this.unisex = unisex;
    }

    public boolean isUnisex() {return unisex;}
    public void setUnisex(boolean unisex) {this.unisex = unisex;}

    @Override
    public String toString() {
        return "Hairdresser"  +super.toString() +
                "- " + unisex + '\n' + "Review average: " + business.reviewAverage();
    }
}
