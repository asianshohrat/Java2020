package firstproject;
import java.util.Scanner;
public class KBInputQuestions {
    public static void main(String[] args) {
        System.out.println("Please type lenth of sides");
        Scanner KB1 = new Scanner(System.in);
        Scanner KB2 = new Scanner(System.in);
        int side1;
        side1 = KB1.nextInt();
        int side2;
        side2 = KB2.nextInt();

        Scanner KB3 = new Scanner(System.in);
        Scanner KB4 = new Scanner(System.in);
        Scanner KB5 = new Scanner(System.in);
        Scanner KB6 = new Scanner(System.in);
        System.out.println("Your rectangle's area is :"+(side1*side2));
        System.out.println("Your rectangle's perimeter is :"+(2*(side1*side2)));

        System.out.println("Please enter MSRP: ");
        int MSRP;
        MSRP = KB1.nextInt();
        System.out.println("Please Enter yor discount %:");
        int discount;
        discount = KB2.nextInt();
        System.out.println("Please enter down payment :");
        int DWNP;
        DWNP = KB1.nextInt();
        System.out.println("Please enter Total Month od loan");
        int TotalMonth;
        TotalMonth = KB2.nextInt();





        System.out.println("Your monthly payment is :"+((MSRP*discount-DWNP)/TotalMonth));
    }
}
