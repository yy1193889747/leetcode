import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ocly
 * @date 2018/1/30 9:19
 */
public class Sort_Characters_By_Frequency {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }


    /**
     * "tree"  "eert"
     *
     * @param s
     * @return return
     */
    public static String frequencySort(String s) {

        /**
         * tree 依次取出一个字符，与其余的比较，并以map形式记录  t:1 r:1 e:2
         * 遍历map 取出value=1的 key放到结果的最后
         *
         */

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        List<Character>[] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >=0; pos--) {
            if (bucket[pos] != null) {
                for (char num : bucket[pos]) {
                    for (int i = 0; i < map.get(num); i++) {
                        sb.append(num);
                    }
                }
            }
        }
        return sb.toString();
    }
}
