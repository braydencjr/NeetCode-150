class Solution {
    public String removeStars(String s) {
        Stack <Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }

        while(st.size() > 0){
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();

  
    }
}