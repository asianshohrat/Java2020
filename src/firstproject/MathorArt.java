package firstproject;
import java.util.Scanner;
public class MathorArt {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("Which lesson do you want (Math/Art) :");
        String Lesson = scanner.next();
        if (Lesson.equalsIgnoreCase("math")){
            System.out.print("Tutor (y/n) : ");
            String tutor = scanner.next();
            if(tutor.equalsIgnoreCase("y")){
                System.out.println("ok");
            }
            else if(tutor.equalsIgnoreCase("n")){
                System.out.println("Study your self");
            }
            else{
                System.out.println("y or n please!!");
            }
        }
        else if (Lesson.equalsIgnoreCase("art")){
            System.out.println("Great Job");
        }

    }
}
