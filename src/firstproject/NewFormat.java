package firstproject;

public class NewFormat {
    public static void main (String[] args){
        System.out.println("\t\t\tReceipt");
        float myFloat=1.99f;
        float myFloat2=2.49f;
        System.out.format(" Item1: \t $ %.2f \n", myFloat);
        System.out.format(" Item1: \t $ %.2f \n", myFloat2);
    }
}

