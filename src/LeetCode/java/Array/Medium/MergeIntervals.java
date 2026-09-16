package LeetCode.java.Array.Medium;

import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        int[][] res = new int[n][2];
        int idx = 0;
        res[0] = intervals[0];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= res[idx][1]) {
                res[idx][1] = Math.max(res[idx][1], intervals[i][1]);
            } else {
                idx++;
                res[idx] = intervals[i];
            }
        }

        return Arrays.copyOf(res, idx + 1);
    }
}
