// 0 1 1 2 3 5 8
public class FibonnaciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, sum;
        System.out.print(a);
        System.out.print(b);
        for (int i = 1; i <=8; i++)
        {
            sum = a + b;
            System.out.println(sum);
            a=b;
            b=sum;
            }
            }
}
