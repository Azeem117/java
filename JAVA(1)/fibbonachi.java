import java.util.Scanner;
public class fibbonachi {
    public static void main(String[] args) {
        int n;
        n = s(); 
        fibbonachi(n);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    public static void fibbonachi(int d) {
        int a =0;
        int b = 1;
        int temp =0;
        for(int i=0;i<d;i++){
            System.out.println(a);
            temp =b;
            b = a + b;
            a = temp;
        }
        
    }
    
}
