import java.util.*;
public class Main {
    public static void main(String[] args) {
        String input = "programming";

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);

        }
        System.out.println("Character frequencies:");
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey()+ ": "+entry.getValue());
        }
    }
}
