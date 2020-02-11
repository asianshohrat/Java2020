package firstproject;
import java.util.Scanner;
public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter consumption of electricity : ");
        int myConsumption=scanner.nextInt();
        double electricbill;
        if (myConsumption<501){
            electricbill=myConsumption*0.3;
        }
        else if (myConsumption<1001) {
           electricbill=myConsumption*0.4;
        }
        else if (myConsumption<2001) {
            electricbill=myConsumption*0.5;
        }
        else {
           electricbill=myConsumption*0.6;
        }
        System.out.println("$"+electricbill);
    }
}
