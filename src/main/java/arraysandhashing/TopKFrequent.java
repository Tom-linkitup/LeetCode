package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            }
        }

        // longest value descendent
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((a, b) -> Integer.compare(b, a)))
                .limit(k).mapToInt(e -> e.getKey()).toArray();

    }
}
