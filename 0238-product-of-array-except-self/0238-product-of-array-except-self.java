class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        
        results[0] = 1;
        for(int i = 1 ; i<nums.length ; i++){
            results[i] = nums[i-1] * results[i-1];
        }

        int postfix = 1;
        for(int i = nums.length -1 ; i>=0 ; i--){
            results[i] *= postfix;
            postfix *= nums[i];
        }
        return results;
    }
}