package reviewsData;
import reviewsMain.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        User[] user = new User[10];
        Scanner Sc = new Scanner(System.in);
        Management management = new Management();
        management.initialize(user);
        System.out.println("Introduce el nombre de ususario");
        String login = Sc.next();
        System.out.println("Introduce tu contraseña");
        String password = Sc.next();
        management.login(login, password);
        if (management.login(login, password) == null) {
            System.out.println("El ususario introducido no esta registrado.");
        }
        else
            System.out.println("Bienvenido");
        int op;
        do {
            System.out.println("Elige opcion");
            op = Sc.nextInt();
            switch (op){
                case 1:
                    User user1 = null;
                    management.showReviews(user1);
                    break;
                case 2:
                    management.sortBusinessesByName();
                    break;
                case 3:
                    System.out.println("Ingresa el tipo de negocio: ");
                    System.out.println("1.- Restaurantes");
                    System.out.println("2.- Peluquerias");
                    System.out.println("3.- Garages");
                    int op1 = Sc.nextInt();
                    management.sortBusinessesByRating(op1);
                    break;
                case 4:
                    //EDITAR MI RESEÑA
                    break;
                case 5:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("La opción que has seleccionado no existe.");
                    break;
            }
        }while (op < 5);
    }
}
