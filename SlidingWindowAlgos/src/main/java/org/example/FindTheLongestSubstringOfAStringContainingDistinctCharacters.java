package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindTheLongestSubstringOfAStringContainingDistinctCharacters {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int end = 0; end < s.length(); end++){
            char right = s.charAt(end);

            if(map.containsKey(right)){
                start = Math.max(start, map.get(right) + 1);
            }
            map.put(right, end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
