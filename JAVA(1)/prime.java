import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n;
        n = s(); 
        prime(n);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static void prime(int a) {
        for(int i =2;i<a;i++) {
            if(a%i==0) {
                System.out.print("Composite");
                break;
            }
            else{
                System.out.print("Prime");
                break;
            }
        }
    }
}
