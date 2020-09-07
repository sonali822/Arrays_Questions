//Sliding Window Maximum 
//(Maximum of all subarrays of size k)
//Given an array and an integer K, find the 
//maximum for each and every contiguous subarray of size k.
public class SlidingWindowMaximum {
    static void printmax(int arr[],int n,int k){
     int j, max;
     for(int i=0;i<=n-k;i++){
         max=arr[i];
         for(j=1;j<k;j++){
             if(arr[i+j]>max){
                 max=arr[i+j];
             }
         }
         System.out.println(max);
     }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        printmax(arr,arr.length,3);
    }
}
