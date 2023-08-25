class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int [] res = new int[nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
            res[i] = count;
            count =0;
        }
        return res;
    }
}