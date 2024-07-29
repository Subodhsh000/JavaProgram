import java.util.Scanner;

class Example {
    public static void main(String args[]){
        //scanner object for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int num = scan.nextInt();
        System.out.println("Enter number1 ");
        int num1 = scan.nextInt();

        if(num==1) {
            System.out.println("Both number are equals");
        }
        else {
            System.out.println("both number are not equals");
        }
        }
}
