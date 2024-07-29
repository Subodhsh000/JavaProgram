// Q.2) WAP to calculate total salary based on Basic Salary.
// Ask user to enter Basic salary
// give 12% OF Basic as HRA
// give 10% OF Basic as DA
// totalsalary=BasicSal+HRA+DA

import java.util.Scanner;

public class TotalSal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        int basic = sc.nextInt();
        int hra = (int) (basic * 0.12);
        int da = (int) (basic * 0.10);
        int total = basic + hra + da;
        System.out.println("Total Salary: " + total);
        }
}

