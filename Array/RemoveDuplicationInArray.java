package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicationInArray {

    public static void arraydup(int arr[],int n){
    LinkedHashSet <Integer> m=new LinkedHashSet<>();
    for (int i = 0; i < arr.length; i++) {
        m.add(arr[i]);
    }
    System.out.println(m);

    }
    public static void main(String[] args) {
        int arr[]={1,5,1,1,4,5,7,9,7};
        int n=arr.length;
        arraydup(arr,n);

    }
}
