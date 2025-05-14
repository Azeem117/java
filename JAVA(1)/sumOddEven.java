import java.util.Scanner;

public class sumOddEven {
    public static void main(String[] args) {
        int n;
        n = s();
        sumE(n); 
        sumO(n);

    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;

    }
    public static void sumE(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0) {
                sum+= i;
            }
        }
        System.out.print("Sum of Even : "+sum+"\n");
    }
    public static void sumO(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0) {
                sum+= i;
            }
        }
        System.out.print("Sum of Even : "+sum);
    }

}
