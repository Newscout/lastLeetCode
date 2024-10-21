package src.main.java.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


//https://leetcode.com/problems/group-anagrams/?envType=problem-list-v2&envId=array&difficulty=MEDIUM
public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length < 2) {
            List<String> list = Arrays.asList(strs);
            result.add(list);
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] key = strs[i].toCharArray();
            Arrays.sort(key);
            String keyStr = new String(key);
            if (map.containsKey(keyStr)) {
                map.get(keyStr).add(strs[i]);
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            map.put(keyStr, list);
        }
        result.addAll(map.values());
        return result;

    }
}
