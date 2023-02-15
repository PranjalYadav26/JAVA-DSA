package Array;

public class stock {

    public static int maxProfit(int arr[],int str,int end){
      
        if (end<=str) {
            return 0;
            
        }
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                   int curr_max=arr[j]-arr[i]+maxProfit(arr, str, i-1)+maxProfit(arr, j+1,end );
                max=Math.max(curr_max, max);
                }
            
                
            }
        }
        return max;


    }
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        int str=0;
        int end=arr.length-1;
        maxProfit(arr,str,end);
    }
    
}
