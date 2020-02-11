package firstproject;
import java.util.Scanner;
public class NestedIfQuestion1 {
    public static void main(String[] args) {
        Scanner info=new Scanner(System.in);
        System.out.print("Are you subscribed (Y/N) : ");
        String Subscribe =info.next();
if (Subscribe.compareToIgnoreCase("Y")==0)
{
    System.out.print("How many storage you needed in GB : ");
int Storage = info.nextInt();

if (Storage>0 && Storage<101){
    System.out.println("Please pay $10.00");}
else System.out.println("Please pay $40");

}
    else
        System.out.println("Please visit subscription page");

}}
