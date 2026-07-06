package LeetCode.java.String;

class Solution {

    // Approach 1: StringBuilder
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String str : word1) {
            s1.append(str);
        }

        for (String str : word2) {
            s2.append(str);
        }

        return s1.toString().equals(s2.toString());
    }

    // Approach 2: Two Pointers
    public boolean arrayStringsAreEqualOptimal(String[] word1, String[] word2) {

        int i = 0, j = 0;
        int p1 = 0, p2 = 0;

        while (i < word1.length && j < word2.length) {

            if (word1[i].charAt(p1) != word2[j].charAt(p2)) {
                return false;
            }

            p1++;
            p2++;

            if (p1 == word1[i].length()) {
                i++;
                p1 = 0;
            }

            if (p2 == word2[j].length()) {
                j++;
                p2 = 0;
            }
        }

        return i == word1.length && j == word2.length;
    }
}