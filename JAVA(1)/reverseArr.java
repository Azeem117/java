public class reverseArr {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        printArray(arr);
    }
    
    public static void printArray(int []array){
        for(int i =array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        
    }
}
