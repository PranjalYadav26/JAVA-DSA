package loopsandothers;
public class revarray {

public static void swaparray(int arr[]){
    int a=0;
    int b=arr.length-1;

    while(a<=b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
      a++;
      b--;


    }
    for (int i=0;i<arr.length;i++){
    System.out.print(arr[i] + ",");
    }
    


}

    public static void main(String[] args) {
    int arr[]={2,3,4,5,6,7,8,9};
    swaparray(arr);
}
    
}
