import java.util.Scanner;
public class sumAvgArr {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int n;
        n = s(); 
        int[] arr = new int[n];
        int sum =0;
        for(int i = 0; i < arr.length;i++){
            System.out.print("Enter Array Element  : ");
            arr[i] = s.nextInt();
            sum+= arr[i];

        }
        int avg = sum/n;
        System.out.print("Sum is : "+sum+"\nAverage is : "+avg);
        
    }

    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    
}
