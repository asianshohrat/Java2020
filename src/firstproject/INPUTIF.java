package firstproject;
        import java.util.Scanner;
public class INPUTIF {
    public static void main(String[] args) {
        System.out.println("Please integer number");
        Scanner KB1 = new Scanner(System.in);
        int N;
        N = KB1.nextInt();
        if (N % 2 == 0)
            System.out.println(N);
        else
            System.out.println("This is not odd number");


    }
}