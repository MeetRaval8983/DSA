import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import javax.swing.event.InternalFrameEvent;

public class Hashmap {
    public static void main(String[] args) {
        System.out.println();
        String s = "Meet";
        int code = s.hashCode();
        System.out.println("Hashcode: " + code);
        Integer a = 123455;
        System.out.println(a + " : " + a.hashCode());

        // HashMap
        // Key–Value pair structure
        // Allows null key and multiple null values
        // Not synchronized (not thread-safe)
        // Unordered (insertion order not guaranteed)
        System.out.println("\nHashmap");
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Meet", 100);
        hm.put("Harshwardhan", 93);
        hm.put("Mrunal", 100);
        hm.put("Sanskruti", 95);
        hm.put("abc", null);
        System.out.println(hm);
        System.out.println(hm.get("Meet"));
        System.out.println(hm.containsKey("Meet"));
        System.out.println(hm.getOrDefault("def", 88));
        for(String name : hm.keySet()) {
            System.out.println(name + " => " + hm.get(name));
        }

        // HashTable
        // Also key–value based
        // Thread-safe (synchronized)
        // Does not allow null key or null values
        // Slower than HashMap due to synchronization
        System.out.println("\nHashtable");
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Meet", 99);
        ht.put("Ranjit", 94);
        System.out.println(ht);
        System.out.println(ht.get("Ranjit"));

        // LinkedHashMap
        // Keeps insertion order
        // Same as HashMap, but ordered
        System.out.println("\nLinkedHashMap");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Aditya", 95);
        lhm.put("Siddhesh", 91);
        System.out.println(lhm);

        // Treemap
        // Sorted according to natural order of keys
        // Does not allow null keys
        System.out.println("\nTreemap");
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Meet", 27);
        tm.put("Indrasen", 40);
        System.out.println(tm);

        // Hashset
        // Uses a HashMap internally
        // Stores only unique elements
        // No duplicate values allowed
        System.out.println("\nHashSet");
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);
    }
}

// | Goal                           | Use             |
// | ------------------------------ | --------------- |
// | Fast lookup, no thread safety  | `HashMap`       |
// | Fast lookup with thread safety | `Hashtable`     |
// | Maintain insertion order       | `LinkedHashMap` |
// | Maintain sorted order          | `TreeMap`       |
// | Unique values only             | `HashSet`       |

