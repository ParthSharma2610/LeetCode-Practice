class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum = 0;
        int oddsum = 0;
        for(int i = 1 ; i<= 2*n ; i++){
            if(i % 2 == 0){
                evensum++;
            }
            else{
                oddsum++;
            }
        }
        return gcd(evensum,oddsum);
    }
    int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        
        return gcd(b,a%b);

    }
}