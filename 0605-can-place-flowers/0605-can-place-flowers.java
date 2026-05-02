class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = 0;
        for(int i=0 ; i<flowerbed.length ; i++){
            if(flowerbed[i] == 0){
                int left = (i==0)? 0 : flowerbed[i-1];
                int right = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];

                if(left==0 && right ==0){
                    num +=1;
                    flowerbed[i] = 1;
                }
            }
        
        }
        return num>= n;
    }
}

// 1,0,1,0,1,0,1
// 1,0,1,0,1,0,1,0,1

// 1 = 3
// 2 = 5
// 3 = 7
// 4 = 9