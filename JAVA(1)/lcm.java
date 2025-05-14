import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        int n,m;
        n = s(); 
        m = s(); 
        int cm ;
        cm = lcm(n,m);
        System.out.print("LCM is : "+cm);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static int lcm(int n,int m){
        return (n*m)/gcd(n,m);
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
