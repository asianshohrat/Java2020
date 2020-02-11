package firstproject;
import java.util.Scanner;
public class LoopImport {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter your starting number : ");
        int a = scanner.nextInt();
        System.out.print("Please enter your end number : ");
        int b=scanner.nextInt();
        if(a<b) {

            for (int i = a; i <= b; i = i + 5) {

                System.out.print(i);
                System.out.print(",");
            }
        }
        else {
            for (int i=b; i<=a; i=i-5){
                System.out.print(i);
                System.out.print(",");
            }
        }


    }
}
