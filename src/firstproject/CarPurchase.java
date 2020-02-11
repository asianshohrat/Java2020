package firstproject;
import java.util.Scanner;
public class CarPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which model? (X/Y) ");
        String model = scanner.next();
        int MSRP = 0;
        if (model.equals("x")) {
            MSRP = 30000;
            System.out.println("Do you want body package :(Y/N)");
            String body = scanner.next();
            if (body.equalsIgnoreCase("y")) {
                MSRP = MSRP + 5000;
            }

            System.out.println("Do you want sound system");
            String sound = scanner.next();
            if (sound.equalsIgnoreCase("y")) {
                MSRP += 3000;

            }
        }
        else if (model.equalsIgnoreCase("Y"))
        {
            MSRP = 35000;
            System.out.println(" Do you want ent. Package? : (Y/N)");
            String ent = scanner.next();
            if (ent.equalsIgnoreCase("y")) {
                MSRP += 8000;
                System.out.println("Safety Package? : (Y/N)");
                String safety = scanner.next();
                if (safety.equalsIgnoreCase("y")) {
                    MSRP += 4000;
                }
            }
        } else {
            System.out.println("Sorry we have only X and Y");
        }
        if (MSRP != 0) {
            System.out.println("$" + MSRP);
        }
    }
}


