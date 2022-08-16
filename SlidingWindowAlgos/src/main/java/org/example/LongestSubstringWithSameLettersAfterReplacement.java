package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLettersAfterReplacement {
    public int characterReplacement(String s, int k) {
        int start = 0, max = 0, maxRepeat = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int end = 0; end < s.length(); end++){
            char right = s.charAt(end);
            map.put(right, map.getOrDefault(right, 0) + 1);
            maxRepeat = Math.max(maxRepeat, map.get(right));

            if(end - start + 1 - maxRepeat > k){
                char left = s.charAt(start);
                map.put(left, map.get(left) - 1);
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
