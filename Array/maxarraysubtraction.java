package Array;

public class maxarraysubtraction {

    public static void submaxarray(int arr[]){
        int submax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int current=Integer.MIN_VALUE;
            for (int j = i+1; j < arr.length; j++) {
                current=arr[j]-arr[i];
                    if (current>submax) {
                        submax=current;
                        
                    }
                }
            

            
        }
        System.out.println(submax);
    }

    //efficient solution
    public static int maxdiff(int arr[]){
        int res =arr[1]-arr[0];
        int min=arr[0];
        for (int j = 0; j < arr.length; j++) {
            res=Math.max(res, arr[j]-min);
            min=Math.min(min, arr[j]);
            
        }

        return res;
    }


    public static void main(String[] args) {
        int arr[]={2,4,6,98,6,4};
       System.out.println(maxdiff(arr)); 
    }
    
}
