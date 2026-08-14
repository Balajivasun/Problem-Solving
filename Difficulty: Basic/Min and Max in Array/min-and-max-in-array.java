class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        return list;
    }
}
