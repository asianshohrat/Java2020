package firstproject;

public class TypeConversion {
    public static void main(String[] args) {
        char myChar='a';
        System.out.println((int)myChar);
        int myint=99;
        System.out.println((char)myint);

        //new example
        int number1=10;
        float number2=4.5f;
        System.out.println((int)(number1*number2));
    }
}
