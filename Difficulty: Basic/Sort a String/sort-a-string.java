class Solution {
    public String sortString(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            sb.append(ch);
        }
        String res=sb.toString();
        return res;
    }
}