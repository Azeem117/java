import java.util.Scanner;
public class numOfOccur {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int n;
        n = s(); 
        int[] arr = new int[n];
        for(int i = 0; i < arr.length;i++){
            System.out.print("Enter Array Element  : ");
            arr[i] = s.nextInt();
        }
        int count =0;
        int see;
        see = s(); 
        for(int i = 0 ; i<arr.length;i++){
            if(see==arr[i]){
                count++;
            }
        }
        System.out.print("Number of occurences of "+see+" in the array is : "+count);
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
    
}
