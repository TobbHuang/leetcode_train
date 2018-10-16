import java.util.*;

/**
 * Created by huangtao on 2018/10/16.
 */
public class p15 {

    public List<List<Integer>> threeSum(int[] nums) {
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

        if(map.containsKey(0) && map.get(0) > 2){
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(0);
            list.add(0);
            results.add(list);
        }

        for (int i = 0; i < keys.size() && keys.get(i) < 0; i++) {
            for (int j = i + 1; j < keys.size(); j++) {

                int target = (keys.get(i) + keys.get(j)) * -1;
                if(keys.get(i) * 2 + keys.get(j) == 0 && map.get(keys.get(i)) >= 2){
                    List<Integer> list = new ArrayList<>();
                    list.add(keys.get(i));
                    list.add(keys.get(i));
                    list.add(keys.get(j));
                    results.add(list);
                } else if(keys.get(i) + keys.get(j) * 2 == 0 && map.get(keys.get(j)) >= 2){
                    List<Integer> list = new ArrayList<>();
                    list.add(keys.get(i));
                    list.add(keys.get(j));
                    list.add(keys.get(j));
                    results.add(list);
                }
                if(target <= keys.get(j))
                    continue;

                if(map.containsKey(target)){
                    List<Integer> list = new ArrayList<>();
                    list.add(keys.get(i));
                    list.add(keys.get(j));
                    list.add(target);
                    results.add(list);
                }
            }
        }

        return results;
    }

}
