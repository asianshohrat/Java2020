package firstproject;
import java.util.Scanner;
public class ApplicantScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Please enter your age : ");
        int age=scanner.nextInt();
        System.out.print("Please enter your Java Score : ");
        double javaScore= scanner.nextDouble();
        // int age = 20;
        //int javaScore = 90;

        if ((age >= 20 && age <= 30) && javaScore >= 80) {
            System.out.println(age * 1.5 + javaScore * 4.5);
        }
        else if ((age >= 20 && age <= 30) && javaScore < 80) {
            System.out.println(age * 1.5 + javaScore * 3.5);
        }
        else if (age > 30 && javaScore >= 80) {
            System.out.println(age * 1.1 + javaScore * 4.5);
        }
        else if (age > 30 && javaScore < 80) {
            System.out.println(age * 1.5 + javaScore * 3.5);
        }
            else {System.out.println("Please enter a valid age or java Score");

        }
    }
}