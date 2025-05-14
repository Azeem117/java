
import java.util.Scanner;

public class geGroup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter age : ");
        n = s.nextInt();
        if(n>0 && n<=13) System.out.print("child");
        else if(n>13 &&n<=20 ) System.out.println("Teen");
        else if(n>=20 && n<60) System.out.println("adult");
        else if(n>60&&n<100) System.out.println("senior");
    }
    
}
