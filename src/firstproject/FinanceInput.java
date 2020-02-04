package firstproject;
import java.util.Scanner;
import java.util.Scanner;

public class FinanceInput {
    public static void main(String[] args) {
        System.out.println("Please enter MSRP: ");
        Scanner KB1 = new Scanner(System.in);
        Scanner KB2 = new Scanner(System.in);
        Scanner KB3 = new Scanner(System.in);
        Scanner KB4 = new Scanner(System.in);
       float MSRP;
        MSRP = KB1.nextFloat();
        System.out.println("Please Enter yor discount %:");
        float discount;
        discount = KB2.nextFloat();
        float DSK=(100-discount)/100;
        System.out.println("Please enter down payment :");
        float DWNP;
        DWNP = KB3.nextFloat();
        System.out.println("Please enter Total Month of loan");
        float TotalMonth;
        TotalMonth = KB4.nextFloat();

        System.out.format("Your monthly payment is :\n "+((MSRP*DSK-DWNP)/TotalMonth));
    }
}
