package Array;

public class sorteArrayCheck {

    public static boolean array(int arr[]){

        for (int i = 1; i < arr.length; i++) {
        if(arr[i-1]>arr[i]){
            return false;
        }
        
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]={3,4,1,7,6};
        System.out.println(array(arr));
    }
}
