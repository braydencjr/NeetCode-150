class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for(int i=0 ; i<senate.length() ; i++){
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            }
            if(senate.charAt(i) == 'D'){
                dire.offer(i);
            }
        }

        while(radiant.size() > 0 && dire.size() > 0){
            int r = radiant.poll();
            int d = dire.poll();

            if(r<d){
                radiant.offer(r + senate.length());
            }
            else{
                dire.offer(d + senate.length());
            }
        }

        if(radiant.size() == 0){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}