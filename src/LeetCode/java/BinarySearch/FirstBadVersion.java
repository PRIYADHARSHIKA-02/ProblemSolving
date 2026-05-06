package LeetCode.java.BinarySearch;

class VersionControl {

    boolean isBadVersion(int version) {
        int firstBad = 4;
        return version >= firstBad;
    }
}
public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        FirstBadVersion fb = new FirstBadVersion();

        System.out.println(fb.firstBadVersion(10));
    }
}

// Time Complexity: O(log n) where n is the number of versions.
// Space Complexity: O(1)