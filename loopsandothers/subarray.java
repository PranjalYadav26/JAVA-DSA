package loopsandothers;
import java.util.*;

public class subarray {
    public static void printSub(int arr[]){
        int ts=0;
    for (int i=0;i<arr.length;i++){
        
        for(int j=i;j<arr.length;j++){
        for(int k=i;k<=j;k++){
            System.out.print(arr[k]+ " ");
        }
        ts++;
            System.out.println();
        }
System.out.println();
    }
    System.out.println(ts);

    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,2,3,4,5};
        printSub(arr);
       
         
    }
}
