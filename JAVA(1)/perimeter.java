import java.util.Scanner;
public class perimeter {
    public static void main(String[] args) {
        System.out.println("Enter Dimension of Quad");
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.print("Enter c : ");
        c = sc.nextInt();
        System.out.print("Enter d : ");
        d = sc.nextInt();
        int e = a+b+c+d;
        System.out.println("Parameter is : "+e);

    }
    
}
