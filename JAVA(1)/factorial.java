import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        n = s();
        int fact = fac(n);
        System.out.print("Factorial is : "+fact);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;

    }
    public static int fac(int n){
        if(n == 1) return 1;
        else return n*fac(n-1);
        
    }
}
