
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter year : ");
        n = sc.nextInt();
        if(n%4==0) System.out.println("leap year");
        else System.out.println("Not Leap year");
    }
    
}
