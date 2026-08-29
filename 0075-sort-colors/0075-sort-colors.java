class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high = nums.length -1;

        while (mid <= high){
            if (nums[mid] ==0){
                // so swap low and mid using temp
                int temp= nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                //increase the low and mid
                low ++;
                mid ++;
            }
            else if (nums[mid]==1){
                // increase the mid
                mid ++;

            }
            else {  //(nums[mid]==2)
                //swap mid and high
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]= temp;
                //decrease high
                high --;
            }
        }
    }
}