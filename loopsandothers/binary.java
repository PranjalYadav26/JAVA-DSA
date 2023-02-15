package loopsandothers;

import java.util.Arrays;

public class binary{


      public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
          if (arr[mid]==key){
            return mid;
            
          }
          
           if(arr[mid]<key){
            start=mid+1;
          }
          
          else{
            end=mid-1;
          }
        }
        return -1;
      }
      
        public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,56,77};
        
        int key=56;
       int result= binarySearch(arr,key);
       if(result==-1){
        System.out.println("not found");
       }
       else{
        System.out.println(result);
      }
    }
    }

