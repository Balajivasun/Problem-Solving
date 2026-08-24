class Solution {
    public boolean findTriplet(int[] arr) {
        for(int t=0;t<arr.length;t++){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==arr[t]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}