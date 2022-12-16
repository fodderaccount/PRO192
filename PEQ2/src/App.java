import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        SpecCar scar = new SpecCar();
        System.out.print("Enter maker: ");
        scar.setMaker(sc.nextLine());
        System.out.print("Enter price: ");
        scar.setPrice(sc.nextInt());
        

        System.out.print("Enter type: ");
        scar.setType(sc.nextInt());
        
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1,2,3): ");
        switch(sc.nextInt()){
            case 1:
            
            System.out.println("OUTPUT");
            System.out.println(scar.toString());
            System.out.println(scar.toString());
            case 2:
            scar.setData();
            System.out.println("OUTPUT");
            System.out.println(scar.toString());
            case 3:
            System.out.println("OUTPUT");
            System.out.println(scar.getValue());

        }
    }
}
