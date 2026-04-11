class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        while(left<right){
            if(nums[left]%2==1 && nums[right]%2==0){
                swap(nums,left,right);
                left++;
                right--;

            }    
            if(nums[left]%2==0) {
left++;
            } 
            if(nums[right]%2==1)  {
                right--;
            }
            }
            return nums;}
            public static void swap(int[] nums,int left,int right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        
    }
