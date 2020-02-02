package firstproject;
import java.util.Scanner;
public class IntStringInput {
    public static void main(String[] args) {
        System.out.println("Please type your name, age, Weght & Haqir Clor");
        Scanner KB1 = new Scanner(System.in);
        Scanner KB2 = new Scanner(System.in);
        Scanner KB3 = new Scanner(System.in);
        Scanner KB4 = new Scanner(System.in);
        String name;
        name = KB1.nextLine();
        int Age;
        Age = KB2.nextInt();
        float WGHT;
        WGHT = KB3.nextInt();
        String HC;
        HC = KB1.nextLine();
        System.out.format("Your Name age, Weght & Haqir Clor is:" + name + Age + WGHT + HC);
    }
}