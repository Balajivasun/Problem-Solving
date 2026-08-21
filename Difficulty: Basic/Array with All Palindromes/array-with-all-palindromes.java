class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(!palin(arr[i])){
                return false;
            }
            else{
                continue;
            }
        }
        return true;
    }
    static boolean palin(int a){
        int og=a;
        int rev=0;
        while(a!=0){
            int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        if(rev!=og){
            return false;
        }
        return true;
    }
}