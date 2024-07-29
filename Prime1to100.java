
// prime number 1 to 100
import java.util.Scanner;
public class Prime1to100 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
        int n = 100;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                    }
                    }
                    if (count == 0) {
                        System.out.println(i + " is a prime number");
                        }
                        }
                        }
                    }
