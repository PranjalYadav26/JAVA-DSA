package Array;

public class Arraylargest_and_secondlargest {
    public static int getLargest(int arr[]){
        // intitalise first element as largest, then compare it to next ->
        int res=0;
        for(int i=1;i<arr.length;i++){
            // If greator element found then current we update the result.
            if(arr[i]>arr[res]){
                res=i;
            }
        }return res;
    }
    public static int secLargest(int arr[]){
        int m= getLargest(arr);
        int z=0;
        for(int j=1;j<arr.length;j++){
            if(arr[m]!=arr[j]&& arr[z]<arr[j]){
                z=j;
            }
        }
        return z;
    }
    //
    public static void main(String[] args) {
        int arr[]={10,104,510,6,7};
        int r=getLargest(arr);
        System.out.println("indx=" + r +" "+ "num=" + arr[r]+ " ");
        int n =secLargest(arr);
        System.out.println("indx=" + n +" "+ "num=" + arr[n]+ " ");
        
    }
}