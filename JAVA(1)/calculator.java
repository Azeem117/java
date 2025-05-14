import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;
        float y ;
        char c;
        System.out.print("Enter x : ");
        x = sc.nextInt();
        System.out.print("Enter operator : ");
        c = sc.next().charAt(0);
        System.out.print("Enter y : ");
        y = sc.nextInt();        
        switch(c) {
            case '+' -> System.out.println(x+y);
            case '-' -> System.out.println(x-y);
            case '*' -> System.out.println(x*y);
            case '/' -> System.out.println(x/y);
            case '%' -> System.out.println(x%y);
            default -> System.out.println("invalid operator");
        }
    }
}