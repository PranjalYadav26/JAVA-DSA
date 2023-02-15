package Array;

public class reversing {
    public static void revArray(int arr[]){
    int start=0; 
    int end= arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--; 
    }
    
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
    }

    }
    public static void main(String[] args) {
        int arr[]={34,4,5,2,6,7,54};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        revArray(arr);

    }
    
}
