package firstproject;
import java.util.Scanner;
public class MaleFemale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your gender : ");
        String gender=scanner.next();
        if (gender.equals("m") || gender.equals("male") ||gender.equals("M") ||gender.equals("Male"))
        {
            System.out.println("Your gender is Male");
        }
        else {System.out.println ("Your gender is Female");
                }
    }
}
