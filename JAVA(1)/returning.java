
import java.util.Scanner;

public class returning {
    public static void main(String[] args) {
        int a,b,c;
        sT();
        a = sInt();
        sT();
        b = sInt();
        c = sum(a,b); 
        System.out.print("Sum is : "+c);
    }
    public static void sT() {
        System.out.print("Enter Number : ");
        
    }
    public static int sInt(){
        int a ;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        return a;
    }
    public static int sum(int a,int b) {
        int sum = a+b;
        return sum;
        
    }
    
}
