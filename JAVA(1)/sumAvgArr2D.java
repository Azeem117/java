public class sumAvgArr2D {
    public static void main(String[] args) {
        int [][] arr = {{2,4,6},{6,8,12},{12,18,36}};
        int sum =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                sum += arr[i][j];
            }
        }
        int avg = sum/9;
        System.out.println("Sum is : "+sum+"\nAverage is : "+avg);
    }
    
}
