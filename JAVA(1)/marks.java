
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n;
        System.out.print("Enter percentage : ");
        n = sc.nextInt();
        if(n>90 && n <100) System.out.println("A");
        else if(n>75) System.out.println("B");
        else if(n>60) System.out.println("C");
        else if(n>30) System.out.println("D");
        else if(n<30&&n>0 ) System.out.println("F");
        else System.out.println("Invalid input");
    }
    
}
