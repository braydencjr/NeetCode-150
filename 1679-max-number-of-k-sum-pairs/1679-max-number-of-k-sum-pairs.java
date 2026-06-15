class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int front = 0;
        int back = nums.length - 1;
        int move = 0;
        int sum = 0;

        while(front < back){
            sum = nums[front] + nums[back];
            if(sum == k){
                move++;
                front++;
                back--;
            }
            else if(sum < k){
                front++;
            }
            else{
                back--;
            }
        }
        return move;
        
    }
}