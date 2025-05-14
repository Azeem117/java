import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        int n,m;
        n = s(); 
        m = s(); 
        int t = gcd(n,m);
        System.out.print("GCD : "+t);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static int gcd(int a,int b){
        while(b!=0) {
            int temp = b;
            b = a%b;
            a =temp;
        }
        return a;
        
    }
}
