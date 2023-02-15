package Array;

public class movingzeroTOLast {
    public static void zeroMoving(int arr[]){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,0,4,0,5,23};
        zeroMoving(arr);
    }
    
}
