package geekbrains.lesson5;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.*;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(8);
        map.put("A1", "B");
        map.put("A2", "B");
        map.put("A3", "B");
        map.put("A4", "B");
        map.put("A5", "B");
        map.put("A6", "B");
        map.put("A7", "B");

        System.out.println("map.containsKey(\"A1\") = " + map.containsKey("A1"));

        Class hashMapClass = HashMap.class;
        Field tableField = hashMapClass.getDeclaredField("table");
        tableField.setAccessible(true);
        int capacity = ((Object[]) tableField.get(map)).length;
        System.out.println("capacity = " + capacity);

        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("m.getKey() = " + m.getKey());
            System.out.println("m.getValue() = " + m.getValue());
            System.out.println("\"----------\" = " + "----------");
        }

        System.out.println("map.getOrDefault(\"Z\", \"Q\") = " + map.getOrDefault("A1", "Q"));

        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("B");

        List<String> list = new ArrayList(Arrays.asList("a", "a", "b", "c", "a"));

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if(str.equals("a")) {
                iter.remove();
            }
        }

        System.out.println("list = " + list);
    }
}
