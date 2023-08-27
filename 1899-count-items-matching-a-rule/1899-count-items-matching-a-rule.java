class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        // creating a for each loop
        for(List<String> num : items) {
            String type = num.get(0);
            String color = num.get(1);
            String name = num.get(2);
        

        if((ruleKey.equals("type") && ruleValue.equals(type)) ||
         (ruleKey.equals("color") && ruleValue.equals(color)) ||
        (ruleKey.equals("name") && ruleValue.equals(name))){
                count++;

        }
        }
        return count;

    }
}