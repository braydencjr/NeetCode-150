class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > 0){
                break;
            }

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int front = i+1;
            int back = nums.length-1;

            while(front<back){
                int sum = nums[i] + nums[front] + nums[back];
                if(sum > 0){
                    back--;
                }
                else if(sum < 0){
                    front++;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[front], nums[back]));
                    front++;
                    back--;

                    while(front < back && nums[front] == nums[front-1]){
                        front++;
                    } 
                }
            }
        
        }
        return result;

    }
}
