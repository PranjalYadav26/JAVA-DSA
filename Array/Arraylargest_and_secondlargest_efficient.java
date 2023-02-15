package Array;

//condition1 -> a[i]>a[largest]: sec=largest,largest=i
//condition2 -> a[i]==a[largest] :ignore
//condition3 -> a[i]<[largest]:
     // |
     // |-> 3subcond1 ->res==-1; :res=i;
     // |-> 3subcond2 ->a[i]<=a[res] : ignore;
     // |-> 3subcond3 ->a[i]>a[res] : res=i;




public class Arraylargest_and_secondlargest_efficient {
    public static int secLargest(int arr[]){
        // initializing largest as 0 which denotes first elemt of array
        // initializing second largest as -1
        int res=-1;
        int largest=0;
        for (int i = 1; i < arr.length; i++) {
            //condition 1
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            //condition 3
            else if(arr[i]!=arr[largest]){
                
                if(res==-1 || arr[i]>arr[res] ){
                res=i;
                }
            }
            
        }
        System.out.println(largest);
        return res;

    }
  public static void main(String[] args) {
    int arr[]={24,4,65,7,89};
    int r=secLargest(arr);
System.out.println(r);
  }
    
}
