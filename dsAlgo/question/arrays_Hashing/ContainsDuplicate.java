package dsAlgo.question.arrays_Hashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicateSolve(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i) && map.get(i)) {
                return true;
            } else {
                map.put(i, true);
            }
        }
        return false;
    }
}