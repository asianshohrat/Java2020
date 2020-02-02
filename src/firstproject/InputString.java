package firstproject;
import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner KB1 = new Scanner(System.in);
        String name;
        name = KB1.nextLine();

        System.out.println("Your Name is:"+name);
    }
}