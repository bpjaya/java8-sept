// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Map;
import java.util.HashMap;
class Solution {
    public static void main(String[] args) {
   
        String str = "aabbbcdd";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:"+map.values());
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
        
          for (var e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " -> " + e.getValue() + " times");
            }
        }
        //java 8 
      String s = "aabbbcdd";
Map<Character, Long> freq = s.chars()
    .mapToObj(c -> (char)c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

freq.forEach((k, v) -> {
    if(v > 1) System.out.println(k + " is duplicate, count = " + v);
});
    }
}
