class Solution {
    public int removeDuplicates(int[] nums) {
        // base condition 
        if(nums.length == 0) {
            return 0;
        }
        int start = 0;
        for(int i =0 ; i<= nums.length -1 ;i++) {
            if(nums[i] != nums[start]){
                start++;
                nums[start] = nums[i];
            }
        }
        return start + 1;
    }
}