package firstproject;
import java.util.Scanner;
public class InputCircle {
    public static void main(String[] args) {
        System.out.println("Give me the radius of your circle");
        Scanner KB1 = new Scanner(System.in);
        float radius;
        radius = KB1.nextFloat();
        System.out.println("Your circle's area is :" + (22 / 7) * radius * radius);
        System.out.println("Your circle's perimeter is :" + (2 * (22 / 7) * radius));
        System.out.format("Your circle's perimeter is : %.4f\n",(2 * 22 / 7) * radius);
        System.out.format("Your circle's area is :%.4f",22 / 7 * radius * radius);
    }
}
