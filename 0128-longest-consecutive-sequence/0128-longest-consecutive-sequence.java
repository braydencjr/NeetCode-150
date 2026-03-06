class Solution {
    public int longestConsecutive(int[] nums) {
        int[] sorted = nums;
        Arrays.sort(sorted);
        int streak = 1;
        int highest = 0;
        for(int i=0 ; i<sorted.length-1 ; i++){
            if(sorted[i] + 1 == sorted[i+1]){
                streak++;
            }
            else if(sorted[i] == sorted[i+1]){
                streak += 0;
            }
            else{
                streak = 1;
            }
            if(streak>highest){
                highest = streak;
            }
        }
        if(sorted.length == 1){
            return 1;
        }

        if(nums.length == 0) return 0;
        return highest;
    }
}