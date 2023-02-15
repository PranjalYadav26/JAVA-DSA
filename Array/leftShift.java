package Array;

import java.util.Scanner;
//method 1 nive solution
public class leftShift{
    public static void leftShiftArraybyOne(int arr[]){
        int n= arr.length;
        int r=arr[0];
      for(int i=1;i<n;i++){
        arr[i-1]=arr[i];

      }
      arr[n-1]=r;
    }

public static void leftShiftByD(int arr[],int d){
    for (int i = 0; i < d; i++) {
        leftShiftArraybyOne(arr);
        
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

}

//method 2 better
public static void lshift(int arr[],int d) {
int temp[]=new int[d];
int n=arr.length;
for (int i = 0; i < temp.length; i++) {
    temp[i]=arr[i];
}
for(int i=0;i<arr.length-d;i++){
    arr[i]=arr[i+d];
}
for(int i=0;i<d;i++){
    arr[n-d+i]=temp[i];
}

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
    
}

//best solution
 public static void reverse(int arr[],int low,int high){
    while (low<high) {
      int temp= arr[low];
      arr[low]=arr[high];
      arr[high]=temp;
      low++;
      high--;  
    }
 }

 public static void dshift(int arr[],int n,int d){
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int arr[]={23,4,66,54,99};
        int n=arr.length;
        System.out.println(n);
        int d= sc.nextInt();
        //leftShiftByD(arr, d);
       dshift(arr, n, d);
    
    }
    
}
