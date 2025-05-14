public class isArrSorted {
    public static void main(String[] args) {
        int[] arr={4,2,8,4,59};
        boolean isSorted = true;
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                }
            }
            if(isSorted) {
                System.out.print("Array is Sorted");
            }
            else{
                System.out.print("Not sorted");
            }
    }
    
}
