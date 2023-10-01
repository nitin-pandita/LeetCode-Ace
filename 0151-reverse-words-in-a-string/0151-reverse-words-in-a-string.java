class Solution {
    public String reverseWords(String s) {
        // Split the input string by spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        // Append the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
