class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0; // Initialize a variable to keep track of the count of smaller numbers
        int[] res = new int[nums.length]; // Create an array to store the result
        
        // Loop through each element in the input array
        for (int i = 0; i < nums.length; i++) {
            // For each element, compare it with every other element in the array
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++; // Increment the count if the current element is greater than the compared element
                }
            }
            res[i] = count; // Store the final count of smaller numbers for the current element in the result array
            count = 0; // Reset the count for the next iteration
        }
        
        return res; // Return the array containing the count of smaller numbers for each element
    }
}
