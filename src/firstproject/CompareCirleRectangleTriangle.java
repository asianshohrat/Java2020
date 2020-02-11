package firstproject;
import java.awt.*;
import java.util.Scanner;
public class CompareCirleRectangleTriangle {
    public static void main(String[] args) {
//creating scanner object to read from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Shape : ");
        //receiving data from the user
        String shape = scanner.next();
        float Perimeter = 0.0f;
        if (shape.equals("c") || shape.equals("circle") || shape.equals("C") || shape.equals("Circle")) {
            System.out.print("Please enter your Circle radius : ");
            float R = scanner.nextFloat();
            Perimeter = (2 * 22 / 7) * R;
            System.out.println(("your Circle's Perimeter is:") + Perimeter);
        } else if (shape.equals("r") || shape.equals("rectangle") || shape.equals("R") || shape.equals("Rectangle")) {
            System.out.print("Please enter your Rectangle Width : ");
            float W = scanner.nextFloat();
            System.out.println("Please enter your Rectangle length:");
            float L = scanner.nextFloat();
            Perimeter=2*(W+L);
            System.out.println(("your Rectangle's Perimeter is:") + Perimeter);
        }
        else if (shape.equals("t") || shape.equals("triangle") || shape.equals("T") || shape.equals("Triangle"))
        {
            System.out.print("Please enter your Triangle's side 1:");
            float s1 = scanner.nextFloat();
            System.out.print("Please enter your Triangle's side 2:");
            float s2 = scanner.nextFloat();
            System.out.print("Please enter your Triangle's side 3:");
            float s3 = scanner.nextFloat();
            Perimeter=s1+s2+s3;
            System.out.println("your Triangle perimeter is:"+Perimeter);
        }
        else
        System.out.println("Please enter correct shape and correct required data");
    }
}
