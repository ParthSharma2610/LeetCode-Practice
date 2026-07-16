class Solution {

    public long gcdSum(int[] nums) {
        int n = nums.length;

        int[] mx = new int[n];
        int prefixMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            prefixMax = Math.max(prefixMax, nums[i]);
            mx[i] = prefixMax;
        }

        int[] prefixGcd = new int[n];
        for (int i = 0; i < n; ++i) {
            prefixGcd[i] = gcd(nums[i], mx[i]);
        }

        Arrays.sort(prefixGcd);

        long ans = 0;
        int left = 0,
            right = n - 1;
        while (left < right) {
            ans += gcd(prefixGcd[left], prefixGcd[right]);
            ++left;
            --right;
        }

        return ans;
    }

    public int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b,a % b);
    }
}