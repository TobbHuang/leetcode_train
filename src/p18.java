import java.util.*;

/**
 * Created by huangtao on 2018/10/26.
 */
public class p18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int m : nums){
            if(map.containsKey(m)){
                map.put(m, map.get(m) + 1);
            } else {
                map.put(m, 1);
            }
        }

        List<List<Integer>> results = new ArrayList<>();

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (int k = 0; k < keys.size(); k++) {
            map.put(keys.get(k), map.get(keys.get(k)) - 1);

            for (int i = k; i < keys.size(); i++) {
                if (map.get(keys.get(i)) == 0) {
                    continue;
                }
                map.put(keys.get(i), map.get(keys.get(i)) - 1);
                for (int j = i; j < keys.size(); j++) {
                    if (map.get(keys.get(j)) == 0) {
                        continue;
                    }
                    int target1 = (target - keys.get(k) - keys.get(i) - keys.get(j));
                    if (target1 < keys.get(j))
                        break;

                    map.put(keys.get(j), map.get(keys.get(j)) - 1);
                    if (map.containsKey(target1) && map.get(target1) > 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(keys.get(k));
                        list.add(keys.get(i));
                        list.add(keys.get(j));
                        list.add(target1);
                        results.add(list);
                    }
                    map.put(keys.get(j), map.get(keys.get(j)) + 1);
                }
                map.put(keys.get(i), map.get(keys.get(i)) + 1);
            }
            map.put(keys.get(k), map.get(keys.get(k)) + 1);
        }

        return results;
    }
}
