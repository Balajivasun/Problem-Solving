class Solution {
    public static int largest(int[] arr) {
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
        
    }
}
