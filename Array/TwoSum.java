package Array;

class twoSum {
    public static int[] even(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if((nums[i]+ nums[j])==target){
                   result[0]=i;
                   result[1]=j;
                
                }
            }
        }
        return result;
    
    }

    public static void main(String[] args) {
        int[] nums={35,5423,3,253,5,};
        int target=40;
        System.out.println(even(nums,target));
    }
}