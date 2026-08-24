class Solution {
    public long[] findElements(long arr[]) {
        Arrays.sort(arr);
        long[] res=new long[arr.length-2];
        for(int i =0;i<res.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
}