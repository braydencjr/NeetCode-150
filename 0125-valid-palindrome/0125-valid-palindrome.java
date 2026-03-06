class Solution {
    public boolean isPalindrome(String s) {
        int forward = 0;
        int backward = s.length()-1;

        while(forward <= backward){
            
            if (!isAlphanum(s.charAt(forward))) {
                forward++;
                continue;
            }

            if (!isAlphanum(s.charAt(backward))) {
                backward--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(forward)) !=  Character.toLowerCase(s.charAt(backward))){
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }

    public boolean isAlphanum(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}