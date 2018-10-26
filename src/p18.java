import java.util.*;

/**
 * Created by huangtao on 2018/10/26.
 */
public class p18 {

    // to be continued

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

            Map<Integer, Integer> map1 = (Map<Integer, Integer>) ((HashMap<Integer, Integer>) map).clone();
            map1.put(keys.get(k), map1.get(keys.get(k)) - 1);

            for (int i = 0; i < keys.size() && keys.get(i) < 0; i++) {
                for (int j = i + 1; j < keys.size(); j++) {

                    int target1 = (target - keys.get(k) - keys.get(i) - keys.get(j)) * -1;
                    if (keys.get(i) * 2 + keys.get(j) == 0 && map1.get(keys.get(i)) >= 2) {
                        List<Integer> list = new ArrayList<>();
                        list.add(keys.get(i));
                        list.add(keys.get(i));
                        list.add(keys.get(j));
                        results.add(list);
                    } else if (keys.get(i) + keys.get(j) * 2 == 0 && map1.get(keys.get(j)) >= 2) {
                        List<Integer> list = new ArrayList<>();
                        list.add(keys.get(i));
                        list.add(keys.get(j));
                        list.add(keys.get(j));
                        results.add(list);
                    }
                    if (target1 <= keys.get(j))
                        continue;

                    if (map1.containsKey(target1)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(keys.get(k));
                        list.add(keys.get(i));
                        list.add(keys.get(j));
                        list.add(target1);
                        results.add(list);
                    }
                }
            }
        }

        return results;
    }
}
