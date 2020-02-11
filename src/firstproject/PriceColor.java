package firstproject;
import java.util.Scanner;
public class PriceColor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your item color Red or Blue: ");
        String color = scanner.nextLine();

        System.out.print("Please enter Tag Price:" );
        double priceTag= scanner.nextDouble();

        System.out.print("Please enter discount percentage(0.1-0.9) :");
        float discount = scanner.nextFloat();

        int colorValue=0;

        if (color.compareToIgnoreCase("red")==0){
            colorValue=20;
        }
        else if (color.compareToIgnoreCase("blue")==0){
            colorValue=10;
        }
        else {
            System.out.println("Red or Blue only");

        }

        double point= priceTag*discount-colorValue;

        if (point>=100){
            System.out.println("Do Not Buy");
        }
        else if (point>=50){
            System.out.println("Buy Later");
        }else if (point<50){
            System.out.println("Buy it now");
        }

    }
}
