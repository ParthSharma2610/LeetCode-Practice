class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int currSum = 0;
        int max = -999999999;
        for(int i = 0 ; i < nums.length ; i++){
            currSum +=nums[i];
            max = Math.max(max,currSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return max;
    }
}