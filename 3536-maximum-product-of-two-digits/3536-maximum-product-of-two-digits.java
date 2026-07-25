class Solution {
    public int maxProduct(int n) {
        int count = 0;
        int num = n;
        while(num != 0){
            count++;
            num = num / 10;
        }
        int[] arr = new int[count];
        num = n;
        for(int i = 0 ; i < count ; i++){
            arr[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        return (arr[count-1] * arr[count-2]);
    }
}