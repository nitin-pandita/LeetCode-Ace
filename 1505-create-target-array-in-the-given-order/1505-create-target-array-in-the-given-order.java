class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
 
        List<Integer> target = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);

        }

        // converting the Arraylist to int list
        int [] res = new int[target.size()];
        for(int i = 0; i < target.size(); i++) {
            res[i] = target.get(i);
        }

        return res;

    }
}