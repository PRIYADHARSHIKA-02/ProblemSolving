package LeetCode.java.String;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxlen = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxlen = Math.max(maxlen, r - l + 1);

        }
        return maxlen;
        
    }
}