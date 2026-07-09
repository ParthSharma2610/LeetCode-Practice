class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int i = 0;
        int j = numbers.size() - 1;
        std::vector<int> out = {0,0};
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
};