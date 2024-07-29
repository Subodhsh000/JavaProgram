//import package for user input.
import java.util.Scanner;

public class OperatorEg {
    public static void main (String[] args){
        // Create Scanner object
        Scanner scan = new Scanner(System.in);
        //take number from user
        System.out.println("Enter number");
        //read user int input using nextInt()  &  store in number
        int number = scan.nextInt();
        System.out.println("Enter number");
        //read user int input using nextInt()  &  store in number1
        int number1 = scan.nextInt();


        System.out.println(number+number1);//arithmetic
        System.out.println(number>number1); //relational
        String s=(number>=number1)? "great":"less"; // ternary
        System.out.println(s);
        System.out.println(number++); //increment
        System.out.println(--number); // decrement
        System.out.println(number);
        System.out.println(number>number1 && number>number1);//logical
        System.out.println(number+=number1);//assignment

//        final int a = 10; // constant variable
//        a++;
//        System.out.println(a);
    }
}
