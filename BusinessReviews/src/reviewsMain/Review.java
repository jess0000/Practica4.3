package reviewsMain;

public class Review{

    User user = new User("fvvzfd", "vfdxv");
    public String comentario;
    public int calificacion;

    public Review(User user, String comentario, int calificacion) {
        this.user = user;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }
    public Review(){
        this.comentario = "";
        this.calificacion = 0;
    }

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    public String getComentario() {return comentario;}
    public void setComentario(String comentario) {this.comentario = comentario;}

    public int getCalificacion() {return calificacion;}
    public void setCalificacion(int calificacion) {this.calificacion = calificacion;}

    @Override
    public String toString() {
        return  user + "\n" + comentario + "\n" + calificacion +
                "\n";
    }
}
