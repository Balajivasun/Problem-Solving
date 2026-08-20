class Solution {
    public int recursiveSum(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return n+recursiveSum(n-1);
        
    }
}