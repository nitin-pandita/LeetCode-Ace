class Solution {
    public boolean checkIfPangram(String sentence) {
        // pangram means english aplhabet appears only once
        boolean [] present = new boolean[26];

        // I need to iterate through the string
        for(char ch : sentence.toCharArray()) {
            // checking if the element is lowercase or not
            if('a' <= ch && ch <= 'z') {
                present[ch - 'a'] = true; // helps me in finding the wheather the letter is present or not

            }

        }
        for(boolean isPresent : present) {
            // if not present return false 
            if(!isPresent) {
                return false;
            }
        }
        // else return true
        return true;
    }
}