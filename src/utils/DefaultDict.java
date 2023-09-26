package utils;

import java.util.HashMap;
import java.util.Map;

public class DefaultDict<T> {
    private Map<T, Integer> frequencyMap;

    public DefaultDict() {
        frequencyMap = new HashMap<>();
    }

    public DefaultDict(T item) {
        this();
        frequencyMap.put(item, 1);
    }

    public void add(T item) {
        if (frequencyMap.containsKey(item)) {
            int currentFrequency = frequencyMap.get(item);
            frequencyMap.put(item, currentFrequency + 1);
        } else {
            frequencyMap.put(item, 1);
        }
    }

    public int getFrequency(T item) {
        return frequencyMap.getOrDefault(item, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Print the frequency of each key and the key itself next to it in alphabetical order of the keys
        frequencyMap.keySet().stream().sorted().forEach(key -> sb.append(frequencyMap.get(key)).append(" ").append(key).append("\n"));

//        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
//            sb.append(entry.getValue()).append(" ").append(entry.getKey()).append("\n");
//        }

        return sb.toString();
    }
}
