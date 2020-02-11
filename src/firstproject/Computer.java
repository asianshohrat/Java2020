package firstproject;
import java.util.Scanner;
public class Computer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Member?(Y/N) : ");
        String member = scanner.next();


         if(member.compareToIgnoreCase("Y")==0) {
            System.out.print("size? (S/M/L) : ");


         }

      //  else if (member.compareToIgnoreCase("N")==0){
          //      System.out.println("Sorry we can not sell you");

        //    }
        String size = scanner.next();

        if(size.equals("S")){

            System.out.println("$9.99");
        }
        else if(size.equals("M")) {
            System.out.println("$10.99");
        }
        else if(size.compareToIgnoreCase("L")==0){
            System.out.println("$11.99");
        }
        else {
            System.out.println("Sorry only S/M/L");
        }
    }
}
