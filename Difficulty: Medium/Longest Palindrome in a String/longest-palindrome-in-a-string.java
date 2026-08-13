import java.util.*;
class Solution {
    static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentLen = j - i + 1;

                if (currentLen > maxLen && ispalin(s, i, j)) {
                    maxLen = currentLen;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    static boolean ispalin(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}