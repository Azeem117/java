
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int n;
        n = s();
        table(n);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;

    }
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        
    }
}
