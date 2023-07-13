class Solution {
    public int[] plusOne(int[] digits) {
        // carry and number
        int carry = 1; 
        int n = digits.length; // number of elements

        // reverse loop for getting the last element;
        for(int i = n-1; i >= 0; i--) {
            int sum = digits[i] + carry; // adding 1
            // updating value
            digits[i] = sum % 10;
            // if there is carry 
            int isCarry = sum / 10; // if remainder then will be added;

            if(isCarry == 0) {
                return digits;
            }
        }
        // what if the first element has a carry eg : 999
        int [] result = new int[n+1]; // increasing the size of array
        result[0] = 1;
        return result;
    }
}