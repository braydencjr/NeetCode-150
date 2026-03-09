class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int back = heights.length - 1;

        int result = 0;

        while(front < back){
            int area = Math.min(heights[front], heights[back]) * (back - front);

            if(area > result){
                result = area;
            }

            if(heights[front] > heights[back]){
                back--;
            } 
            else{
                front++;
            }
        }
        return result;
    }
}
