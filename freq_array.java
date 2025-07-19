import java.util.*;
class freq_array {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {1, 2, 2, 1, 3};
        // int[] arr = {5, 5, 5, 5};
        Map<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Entry set: " + h.entrySet());
        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : h.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        System.out.println(result);
    }
}