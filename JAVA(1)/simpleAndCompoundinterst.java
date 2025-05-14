
import java.util.Scanner;

public class simpleAndCompoundinterst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float p,r,t;
        System.out.print("Enter p : ");
        p = sc.nextFloat();
        System.out.print("Enter r : ");
        r = sc.nextFloat();
        System.out.print("Enter t : ");
        t = sc.nextFloat();
        double si,ci;
        si = (p*r*t)/100;
        ci = p*Math.pow(1+(r/100),t);
        System.out.print("Simple interst : "+si+"\ncompound intrest is : "+ci);
    }
    
}
