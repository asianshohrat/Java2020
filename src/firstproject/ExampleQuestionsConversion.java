package firstproject;

public class ExampleQuestionsConversion {
    public static void main(String[] args) {
        int myInt=300;
System.out.println(((byte)myInt));
System.out.println(myInt);

// doble to float
        double myDouble=2.123456789101112131415;

                System.out.println(myDouble);
                System.out.println((float)myDouble);

                String myString="Hello";
                //will not work
       // System.out.println(myString+"\n"+(char)(myString));
    }
}
