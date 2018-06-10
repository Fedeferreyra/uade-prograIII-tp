package greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cache {

    public int minimizeMissCache(int[] sequence, int k) {
        List<Integer> integers = sortedList(sequence);
        int[] cache = new int[k];
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < cache.length; j++) {
                if (cache[j] == integers.get(i)) {

                }
            }
        }
        return 1;
    }

    private List<Integer> sortedList(int[] sequence) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sequence.length; i++) {
            list.add(sequence[1]);
        }
        list.sort(Comparator.reverseOrder());
        return list;
    }

}
