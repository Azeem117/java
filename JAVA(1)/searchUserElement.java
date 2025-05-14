import java.util.Scanner;

public class searchUserElement {
    public static void main(String[] args) {
        int[] ar= {3,4,6,5,3,6,8,9,0};

        int l;
        l = s(); 
        boolean isFound = isFound(ar,l);
        if(isFound){
            System.out.print("Element found");
            
        }else{
            System.out.print("Element not found");
            
        }
        

    }
    public static boolean isFound(int arr[],int num){
        for(int i =0;i<arr.length;i++){ 
            if(num== arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static int s(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        return n;
    }
}
