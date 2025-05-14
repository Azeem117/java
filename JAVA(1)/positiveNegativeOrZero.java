
import java.util.Scanner;

public class positiveNegativeOrZero {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num>0) System.out.println("positive number");
        else if(num <0) System.out.println("Negative Numbere ");
        else System.out.println("Zero");
        
    }
    
}
