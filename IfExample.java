import java.util.Scanner;
class IfExample {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you know programming or not yes/no: ");
        //store input in check variable
        String check = scan.next();

        //condition
        if(check.equalsIgnoreCase("yes")) {//true
            System.out.println("Knows programming lang ");
        }
        else{
            System.out.println("you don't have programming lang");

        }
    }
}
