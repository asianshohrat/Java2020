package firstproject;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args){
        Scanner myKeyboard = new Scanner(System.in);
        int UserInput;
        UserInput = myKeyboard.nextInt();
        System.out.println(UserInput);
    }
}
