import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
       int n;
       n = s(); 
       //p1(n); 
       p2(n);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    
    public static void p1(int n) { 
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public static void p2(int n) {  
        int i ,j,k;
        for( i = 0;i<n;i++){ 
            for( j =0;j<n;j++){
                System.out.print("*");
            }
            for( k=1;k<n;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
