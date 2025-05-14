import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter Number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum is : "+c);
    }
    
}
