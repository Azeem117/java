public class pallenndromeArr {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,4,2};
        reverseArr(arr);
    }
    public static void reverseArr(int[] ar){
        int[] array = new int[ar.length];
        for(int i =0;i<ar.length;i++){
            array[i] = ar[ar.length-i-1];
        }
        pallendrome(array,ar);
    }
    public static void pallendrome(int []array,int[]ar){
        boolean pal = true;
        for(int i =0;i<ar.length;i++){
            if(array[i] != ar[i]){
                pal = false;
                break;
            }
        }
        if(pal){
            System.out.print("Pallendrome");
        }
        else{
            System.out.print("Non Pallendrome");
        }
        
    }
}
