package Array;

public class sortedFrequency {

    public static void printFreq(int arr[],int n){
        int freq=1;
        int i=1;
        while (i<n) {
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            freq=1;
            i++;
            
            
        }
        if (n==1 || arr[n-1]!=arr[n-2]) {
            System.out.println(arr[i-1]+" "+1);
            
        }

    }
    public static void main(String[] args) {
        int arr[]= {40,50,50,50,60};
        int n= arr.length;
        printFreq(arr,n);
    }
}
