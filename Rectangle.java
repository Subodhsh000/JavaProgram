// Q.1) WAP to get area of rectangle.
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int l,w, A;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        l=sc.nextInt();
        System.out.println("Enter Width:");
        w=sc.nextInt();
        A=l*w;
        System.out.println("Area of Rectangle is:"+A);
    }
}
