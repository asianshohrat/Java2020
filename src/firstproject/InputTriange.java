package firstproject;
import java.util.Scanner;
public class InputTriange {
    public static void main(String [] args) {
        System.out.println("Please type all three edges");
        Scanner KB1 = new Scanner(System.in);
        Scanner KB2 = new Scanner(System.in);
        Scanner KB3 = new Scanner(System.in);

        int EDG1;
        int EDG2;
        int EDG3;
        EDG1 = KB1.nextInt();
        EDG2 = KB2.nextInt();
        EDG3 = KB3.nextInt();

        System.out.println("The Perimeter of Triangle is:"+(EDG1+EDG2+EDG3));


    }
}
