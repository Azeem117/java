import java.util.Scanner;
public class elementSumArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s(); 
        int[] ar= new int[n];
        for(int i =0;i<ar.length;i++){ 
            System.out.print("Enter Array Element : ");
            ar[i] = s.nextInt();

        }
        for(int i =0;i<n;i++){ 
            System.out.println("Array Element : "+ar[i]);

        }


    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
}
