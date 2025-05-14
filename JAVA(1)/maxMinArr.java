import java.util.Scanner;
public class maxMinArr {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int n;
        n = s(); 
        int[] arr = new int[n];
        for(int i = 0; i < arr.length;i++){
            System.out.print("Enter Array Element  : ");
            arr[i] = s.nextInt();
        }
        int min,max;
        min = arr[0];
        max =0;
        for(int i = 0; i < arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        for(int i = 0; i < arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print("Min Element : "+min+"\nMax Element is : "+max);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
}
