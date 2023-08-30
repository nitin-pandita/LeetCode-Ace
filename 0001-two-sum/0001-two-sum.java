class Solution {
    public int[] twoSum(int[] nums, int target) {
        // two for loop for iterating through the array
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}