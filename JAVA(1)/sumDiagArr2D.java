public class sumDiagArr2D {
    public static void main(String[] args) {
        int [][] arr = {{2,4,6},{6,8,12},{12,18,36}};
        int sum =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Sum of diagonal Elements : "+sum);
    }
    
}
