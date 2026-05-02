class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int current = 0;
        for(int i=0 ; i<gain.length ; i++){
            current += gain[i];
            highest = Math.max(current, highest);
        }

        return highest;
    }
}