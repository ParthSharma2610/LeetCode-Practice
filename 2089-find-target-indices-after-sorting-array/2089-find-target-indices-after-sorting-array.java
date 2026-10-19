class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> out = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                out.add(i);
            }
        }
        return out;
    }
}