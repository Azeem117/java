import java.util.Scanner;
public class search2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int [2][2];
        arr[0][0] = 15;
        arr[0][1] = 7;
        arr[1][0] = 8;
        arr[1][1] = 5;
        System.out.print("Enter Element To  be Searched : ");
        int n;        
        n = sc.nextInt();   
        boolean b = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2;j++) {
                if(n==arr[i][j]){
                    b = true;
                    break;
                }
                else{
                    b = false;

                }
                
            }
            
        }
        if(b){
            System.out.print("Element Found");
        }
        else{
            System.out.print("Element not Found");
        }
    }
    

    
}
