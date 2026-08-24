class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int st = 0;
        int last = arr.length - 1;
        while (st <= last) {
            if (st != last) {
                list.add(arr[last]); 
                list.add(arr[st]);   
            } else {
                list.add(arr[st]);   
            }
            last--;
            st++;
        }
        return list;
    }
}