package ru.zinnurov;

import java.util.HashMap;
import java.util.Map;

/**
 * The program displays - true if there are no two or more identical values in the collection, otherwise - false
 *
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 22.10.2018
 */

public class MapFilter {
    public static void main(String[] args) {
        System.out.println("Map is unique? : " + isUnique(getMap()));
    }

    private static Map<String, String> getMap() {
        Map<String, String> hashmap = new HashMap<String, String>();

        hashmap.put("Вася", "Иванов");
        hashmap.put("Вадим", "Петров");
        hashmap.put("Виктор", "Сидоров");
        hashmap.put("Сергей", "Савельев");
        hashmap.put("Вадим", "Петров");

        return hashmap;
    }

    private static boolean isUnique(Map<String, String> hashmap) {
        boolean valueIsUnique = true;
        for(Map.Entry<String, String> entry: hashmap.entrySet()) {
            for(Map.Entry<String, String> entry1: hashmap.entrySet()) {
                if((entry.getKey() != entry1.getKey()) && (entry.getValue() == entry1.getValue())) valueIsUnique = false;
            }
        }
        return valueIsUnique;
    }
}
