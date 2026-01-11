import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Map to store grouped anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            // Convert word to char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // Create key from sorted characters
            String key = new String(chars);

            // If key not present, create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original word to its group
            map.get(key).add(word);
        }

        // Print grouped anagrams
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
