import java.util.Scanner;

public class NestedIfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What Language you know development/designing/testing: ");
        String check = sc.next();

        if (check.equalsIgnoreCase("yes"))                       //true-outer if
        {      // equalsIgnoreCase is ignores case sensitive
            System.out.println("Enter You Know Development Language: ");
            String language = sc.next();
            if (language.equalsIgnoreCase("Development"))        //true-inner if
            {
                System.out.println("Knows Development");
            } else if (language.equalsIgnoreCase("designing"))    //true-inner if
            {
                System.out.println("Knows Designing");
            } else if (language.equalsIgnoreCase("testing"))       //true-inner if
            {
                System.out.println("Knows Testing");
            } else                                                            //false-inner if
            {
                System.out.println("Knows Nothing");
            }
        } else {                                                               //false-outer if
            System.out.println("Does not no Programming Language");
        }
    }
}