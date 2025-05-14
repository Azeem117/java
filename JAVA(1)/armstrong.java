import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        int n;
        n = s();
        int i;
        i = numd(n);
        armstrong(n,i);
    }
    public static int numd(int n) {
        int m =0;
        int dig =0;
        while(n>0){
            m = n%10;
            n=n/10;
            dig++;
        }
        return dig;
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static void armstrong(int a,int i) {
        int check =a;
        int temp =0;
        int m =0;
        while(a>0){
            m = a%10;
            a = a/10;
            temp += Math.pow(m,i); 
        }
        if(temp == check){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
