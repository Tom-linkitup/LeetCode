package arraysandhashing;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        if (strs.length == 1) {
            result.add(Arrays.asList(strs));
            return result;
        }

        for (int i = 0; i < strs.length; i++) {
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String str = String.valueOf(chArr);
            if(!hm.containsKey(str)){
                hm.put(str, new ArrayList<>());
            }
            hm.get(str).add(strs[i]);
        }

        result.addAll(hm.values());
        return result;
    }
}
