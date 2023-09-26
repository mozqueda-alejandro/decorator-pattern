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
        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            sb.append(entry.getValue()).append(" ").append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }
}
