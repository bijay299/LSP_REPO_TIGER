package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

public class MapUtilities {
    public static int commonKeyValuePairs(
        HashMap<String, String> map1, HashMap<String, String> map2) {

        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate through the first map's keys
        for (String key : map1.keySet()) {
            // Check if the key exists in map2 and the values match
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
