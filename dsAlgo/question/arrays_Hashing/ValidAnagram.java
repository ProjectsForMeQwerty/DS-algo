package dsAlgo.question.arrays_Hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return map.values().stream().allMatch(count -> count == 0);
    }

    public boolean isAnagramFastApproch(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        List<Character> sl = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> tl = t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.sort(sl);
        Collections.sort(tl);
        if (sl.equals(tl)) {
            return true;
        }
        return false;
    }

    public boolean isAnagramFastApprochWithOnlyArray(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);
        if (Arrays.equals(sa, ta)) {
            return true;
        }
        return false;

    }

}
