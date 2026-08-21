class Solution {
    public boolean isBinary(String s) {
        for(int i=0;i<s.length();i++){
            if((s.charAt(i))!='1' && (s.charAt(i))!='0'){
                return false;
            }
        }
        return true;
    }
}