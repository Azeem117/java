public class arraying {
    public static void main(String[] args) {
        //Array Declaration
        int [][] ar = new int [2][3];
        int[][] inarr = {{1,2,3},{4,5,6},{7,8,9}};
        int  i =0;
        while(i<inarr.length){
            int  j =0;
            while(j<inarr[i].length){
                System.out.print("  "+inarr[i][j]+"  ");
                j++;
            }
            System.out.println();
            i++;
        }


    }
    
}
