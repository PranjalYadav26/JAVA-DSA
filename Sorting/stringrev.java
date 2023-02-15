package Sorting;

public class stringrev {
public static void main(String[] args) {
    String sc ="HELLO";
    char arr[]= sc.toCharArray();
     int start=0;
     int end=arr.length-1;
    while (start<end) {
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
    
    
        
    
}
   
    
}
