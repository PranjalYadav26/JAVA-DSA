package Array;

import java.util.ArrayList;

public class leadersinArray {

    //nive solution 
    public static void array(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            boolean flag= false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<=arr[j]) {
                    flag=true;
                    break;     
                }     
                }
                if (flag==false) {
                    System.out.println(i);
            }
        }
    }

    // best approch
    public static void leaderarry1(int arr[], int n){
        int current=arr[n-1];
        System.out.println(current);
        for (int i = n-2; i>=0; i--) {
            if(arr[i]> current){
                current=arr[i];
                System.out.println(arr[i]);
            }
            
        }
    }
    public static void main(String[] args) {

        int[] arr={7,10,4,10,6,5,2};
        int n=arr.length;
        leaderarry1(arr, n);
    }
    
}
