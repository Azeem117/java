import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int n;
        n = s();
        int m;
        m = sod(n);
        System.out.print("Sum is : "+m);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static int sod(int n){
        int i =0;
        int no=0;
        while(n>0){
            no = n%10;
            n = n/10;
            i += no;
        }        
        return i;
    }
}
