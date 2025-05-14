public class mergeSortedArr {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] ar = {12,14,16,18,20};
        merge(arr,ar);
    }
    public static void merge(int[]arr,int[]ar) {
        int l = arr.length+ar.length;
        int[] array = new int[l];
        for(int i = 0;i<arr.length;i++){
            array[i] = arr[i];
        }
        for(int i = 0;i<ar.length;i++){
            array[i+arr.length] = ar[i];

        }
        printArr(array);
    }
    public static void printArr(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
