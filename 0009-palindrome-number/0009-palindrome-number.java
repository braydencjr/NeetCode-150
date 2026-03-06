class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int front = 0;
        int back = s.length()-1;

        while(front<=back){
            if(s.charAt(front) != s.charAt(back)){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}