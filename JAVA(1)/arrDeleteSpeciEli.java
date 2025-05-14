public class arrDeleteSpeciEli {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8};
        int toDel = 5;
        for(int i=0;i<arr.length;i++){
            if(toDel==arr[i]){
                arr[i] =0;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
