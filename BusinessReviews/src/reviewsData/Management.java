package reviewsData;

import reviewsMain.*;

import java.util.Random;
import java.util.Scanner;

public class Management {
    User[] user = new User[10];
    User user2;
    Business[] businesses = new Business[6];
    int cantidad = 0;
    int cantidadNeg = 0;

    public void initialize(User[] user){
        String[] nombres = {"Carlos", "María", "Pedro", "Juan", "Cristina", "Pablo", "Ana", "Eva", "Pascual", "Jose"};
        String[] contrasenyas = {"12345", "56789", "90123", "34567", "78901", "13579", "24680", "09876", "54321", "45678"};
        for (int i = 0; i < user.length; i++)
            user[i] = new User(nombres[i], contrasenyas[i]);
        Scanner Sc = new Scanner(System.in);
        String[] negocios = {"Velvet", "Caos", "Boquería", "Casa Pepe", "Taller hermanos", "Cochera"};
        String[] ubi = {"Alicante", "Benidor", "Valencia", "Madrid", "Barcelona", "Mallorca"};
        String[] tipo = {"", "", "Italiano", "Japones"};
        boolean[] unisex = {true, false};
        Random ran = new Random();
        float randomNum = 10 + ran.nextInt((100 - 100) + 1);
        for (int i = 0; i < businesses.length; i++){
            if (i <= 1)
                businesses[i] = new Hairdresser(negocios[i], ubi[i], new Review(), unisex[i]);
            if (i <= 3 && i >1)
                businesses[i] = new Restaurant(negocios[i], ubi[i], new Review(), tipo[i]);
            else
                businesses[i] = new Garage(negocios[i], ubi[i], new Review(), randomNum);
        }
    }
    void mostrar(){
        for (int i = 0; i < user.length; i++){
            user[i].toString();
        }
        for (int i = 0; i < businesses.length; i++){
            businesses[i].toString();
        }
    }
    public User login(String login, String password) {
        user2 = new User(login, password);
        boolean correcto = false;
        for (int i = 0; i< user.length; i++)
            if (user2.getNombre() == user[i].getNombre() && user2.getPassworld() == user[i].getPassworld())
                correcto = true;
        if (correcto == true)
            return user2;
        else
            return null;
    }
    public void showReviews(User user){
        Review review = new Review();
        if (review.getUser() == user)
            System.out.println(review);
    }
    public void sortBusinessesByName(){
        Business[] business2 = new Business[businesses.length];
        for (int i = 0; i< businesses.length; i++)
            if (businesses[i].nombre.compareTo(businesses[i+1].nombre) >= 0)
                business2[i]= businesses[i];
        for (int i = 0; i< business2.length; i++)
            System.out.println(business2[i].toString());
    }
    public void sortBusinessesByRating(int type){
        Business[] business2 = new Business[businesses.length];
        if (type == 0){
            for (int i = 0; i< businesses.length; i++)
                if (businesses[i].getReview() == businesses[i+1].getReview())
                    business2[i]= businesses[i];
        }
        for (int i = 0; i< business2.length; i++)
            System.out.println(business2[i].toString());
    }
    public Business findBusiness(String name){

        return null;
    }
    public Review findReview(User user, Business business){

        return null;
    }
    public void changeReview(Review r, String comment, int rating){

    }
}
