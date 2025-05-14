import java.util.Scanner;

public class swapNum {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter x : ");
        x = sc.nextInt();
        System.out.print("Enter y : ");
        y = sc.nextInt();
        int t ;
        t = x;
        x = y;
        y = t;
        System.out.println("X : "+x+"\nY : "+y);
    }
    
}
