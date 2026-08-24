class Solution {
    int minDist(int arr[], int x, int y) {
        int yi = -1;
        int xi = -1;
        int min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                xi = i;
                if (yi != -1) {
                    min_dist = Math.min(min_dist, Math.abs(xi - yi));
                }
            } else if (arr[i] == y) {
                yi = i;
                if (xi != -1) {
                    min_dist = Math.min(min_dist, Math.abs(yi - xi));
                }
            }
        }
        if (xi == -1 || yi == -1) {
            return -1;
        }
        return min_dist;
    }
}