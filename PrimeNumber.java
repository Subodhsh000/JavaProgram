// Check the whether the number is prime is not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i;
        boolean flag = true;
        for (i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = false;
                break;
                }
                }
                if (num == 1) {
                    System.out.println("1 is neither prime nor composite number");
                    }
                    if (num == 2) {
                        System.out.println(num + " is a prime number");
                        }
                        if (num > 2 && flag == true) {
                            System.out.println(num + " is a prime number");
                            }
                            else {
                                System.out.println(num + " is not a prime number");
                                }
                                }
                                
    
}
