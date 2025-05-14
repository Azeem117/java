public class loopFunction {
    public static void main(String[] args) {
        starTriangle();
    }
    public static void starTriangle() {
        int n =5;
        for(int i = 0;i<n;i++){
          for(int j = 0 ;j<i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
        }
    }
}
