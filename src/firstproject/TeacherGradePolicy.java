package firstproject;
import java.util.Scanner;
public class TeacherGradePolicy {
    public static void main(String[] args) {

        Scanner myscan=new Scanner (System.in);
        System.out.print("Please enter your grade : ");
        double Grade = myscan.nextDouble();

        if (Grade<0){
            System.out.println("Grade can not be less than 0 ");}

            else if ((Grade<50))
        {
            System.out.println("Your Grade is F " + "You failed study more");
        }
        else if ((Grade<60)) {
            System.out.println("Your Grade is D " + "You barely passed study more");
        }
        else if ((Grade<70))
        {
            System.out.println("Your Grade is C " + "You barely passed study more");
        }
        else if ((Grade<80))
        {
            System.out.println("Your Grade is B ");
        }else if ((Grade<90))
        {
            System.out.println("Your Grade is A " );
        }
        else if ( (Grade<100))
        {
            System.out.println("Your Grade is A + " );
        }
        else
            System.out.print("Invalid Data");
    }
}

