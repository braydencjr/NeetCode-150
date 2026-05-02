class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        StringBuilder result = new StringBuilder();

        int i=0;
        int j=0;

        while(i<a || j<b){
            if(i<a){
                result.append(word1.charAt(i));
                i++;
            }
            if(j<b){
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }
}