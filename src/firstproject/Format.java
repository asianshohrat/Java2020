package firstproject;

public class Format {
    public static void main (String[] args){
        String java= "Java is fun";
        float myFloat=78.98f;
        double myDouble=78.980000;
        System.out.format("Do you think %s \n",java);
        System.out.format("\t Yes %% %f of people think it is fun \n", myFloat);
        System.out.format("\t Yes %% %.2f of the people think it is fun ", myDouble);
    }
}
