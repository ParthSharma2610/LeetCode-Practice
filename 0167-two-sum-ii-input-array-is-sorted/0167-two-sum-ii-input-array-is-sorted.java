class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int out[] = new int[2];
        while(i < j){
            if(numbers[i] + numbers[j] < target){
                i++;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                out[0] = i+1;
                out[1] = j+1;
                break;
            }
        }
        return out;
    }
}