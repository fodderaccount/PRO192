
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Book car = new Book();
        System.out.print("Enter title: ");
        car.setTitle(sc.nextLine());
        System.out.print("Enter price: ");
        car.setPrice(sc.nextInt());
        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        
        System.out.print("Enter TC (1 or 2): ");
        int option =sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("OUTPUT:");

                System.out.println(car.getTitle());

                break;s
            case 2:
                System.out.print("Enter new price: ");
                car.setPrice(sc.nextInt());
                System.out.println("OUTPUT:");
                System.out.println(car.getPrice());
                break;

        }

    }

    
}
