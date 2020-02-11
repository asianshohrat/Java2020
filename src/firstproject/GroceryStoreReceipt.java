package firstproject;
import java.util.Scanner;
public class GroceryStoreReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //constant data
        float itemcost1=2.49f;  float price1=0.0f;
        float itemcost2=4.79f;  float price2=0.0f;
        float itemcost3=1.65f;  float price3=0.0f;
        float itemcost4=7.88f;
        float itemcost5=0.99f;
        System.out.print("Enter product-1 ID of your items:");
       int id1;
        id1 = scanner.nextInt();
        id1=id1;
        System.out.print("Enter product-1 quantity of your items:");
        float QTY1;
        QTY1=scanner.nextFloat();
        if (id1==123)
            price1=QTY1*itemcost1;
        if (id1==124)
            price1=QTY1*itemcost2;
        if (id1==125)
            price1=QTY1*itemcost3;
        if (id1==126)
            price1=QTY1*itemcost4;
        if (id1==127)
            price1=QTY1*itemcost5;
        System.out.print("Enter product-2 ID of your items:");
        int id2;
        id2 = scanner.nextInt();
        System.out.print("Enter product-2 quantity of your items:");
       float QTY2;
        QTY2=scanner.nextFloat();
        if (id2==123)
            price2=QTY2*itemcost1;
        if (id2==124)
            price2=QTY2*itemcost2;
        if (id2==125)
            price2=QTY2*itemcost3;
        if (id2==126)
            price2=QTY2*itemcost4;
        if (id2==127)
            price2=QTY2*itemcost5;
        System.out.print("Enter product-3 ID of your items:");
        int id3;
        id3 = scanner.nextInt();
        System.out.print("Enter product-3 quantity of your items:");
        float QTY3;
        QTY3=scanner.nextFloat();
        if (id3==123)
            price3=QTY3*itemcost1;
        if (id3==124)
            price3=QTY3*itemcost2;
        if (id3==125)
            price3=QTY3*itemcost3;
        if (id3==126)
            price3=QTY3*itemcost4;
        if (id3==127)
            price3=QTY3*itemcost5;

        System.out.println("\t\t\tThe Receipt");
        System.out.println("\tID \t\t quantity \t\tPrice");
        System.out.println("------------------------------------");
        System.out.format("\t"+id1+"\t\t\t"+"%.2f"+"\t\t\t"+"$%.2f\n",QTY1,price1);
        System.out.format("\t"+id2+"\t\t\t"+"%.2f"+"\t\t\t"+"$%.2f\n",QTY2,price2);
        System.out.format("\t"+id3+"\t\t\t"+"%.2f"+"\t\t\t"+"$%.2f\n",QTY3,price3);
        System.out.println("---------\t---------\t------------");
        System.out.format("\tTotal"+"\t\t"+"%.2f"+"\t\t\t"+"$%.2f\n",(QTY1+QTY2+QTY3),(price1+price2+price3));
        System.out.println(" ");
        System.out.println("---------Thank you. Come Again!------------");
    }
}
