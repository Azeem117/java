
public class rectangle {
    public static void main(String[] args) {
        int row = 4;
        int col =5;
        for(int i=0;i<=row;i++){
            for(int j =0;j<=col;j++){
                // if(i==0||i==row){
                //     System.out.print("*");
                // }
                // else if(i!=0||i!=row){
                //     if(j==0||j == col){
                //         System.out.print("*");
                //     }
                //     else{
                //         System.out.print(" ");
                //     }
                // }
                if(i==0||j==0||i==row||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
