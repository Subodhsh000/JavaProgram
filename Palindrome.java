// Reverse number is equal to same in palindrome is or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0, rem;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            }
            if (temp == rev) {
                System.out.println("The number is palindrome");
                }
                else {
                    System.out.println("The number is not palindrome");
                    }
                    }
                }
