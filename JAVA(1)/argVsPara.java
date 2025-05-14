import java.util.Scanner;

public class argVsPara{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        int s = sum(a,b);
        System.out.print("Sum is : "+s);
    }
    public static int sum(int one,int two) {
        int sum ;
        sum = one + two;
        return sum;
    }
}