class Solution {
    public int[] countOddEven(int[] arr) {
        int[] res=new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                res[1]=res[1]+1;
            }
            else{
                res[0]=res[0]+1;
            }
        }
        return res;
        
    }
}