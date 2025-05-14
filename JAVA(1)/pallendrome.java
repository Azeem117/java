import java.util.Scanner;
public class pallendrome {
    public static void main(String[] args) {
        int n;
        n = s(); 
        int t =0;
        t = reverse(n);
        if(n==t) { 
            System.out.print("Pallendrome");
        }
        else{
            System.out.print("Non Pallendrome");
        }
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static int reverse(int a) {
        int m = 0,temp = 0;
        while(a>0) {
            temp = a%10;
            a = a/10;
            m = 10*m + temp;
        }
        return m;
    }
}
