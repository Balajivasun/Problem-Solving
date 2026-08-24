class Solution {

    int maxValue(int arr[]) {
        int sum=0;
        Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           sum+=arr[i]*i;
       }
       return sum;
    }
}
