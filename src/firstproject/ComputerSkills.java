package firstproject;
import java.util.Scanner;
public class ComputerSkills {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.print("WHat Computer Skills do you have (Java/SQL/Cloud) : ");
        String CompSkills = info.next();
        if (CompSkills.equalsIgnoreCase("Java")) {
            System.out.print("Please enter your score : ");
            int javascore = info.nextInt();
        } else if (CompSkills.equalsIgnoreCase("SQL")) {
            System.out.println("Please enter your Hackerrank score : ");
            int SQLscore = info.nextInt();
        } else if (CompSkills.equalsIgnoreCase("Cloud")) {
            System.out.println("Doy you have Certificate :(Y/N) : ");
            //char Cer=info.next();
        } else {
            System.out.println("Only Java/SQL/Cloud");
        }
    }
}

