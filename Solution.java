import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

/**
 * created by Yoga Agung created date 13/06/2019
 * 
 * function to search frequent element in an array
 */

class Solution {
    static char lookUp(char[] params) {
        Map<Character, Integer> map = new HashMap<>();

        int length = params.length;

        for (int i = 0; i < length; i++) {
            if (map.containsKey(params[i])) {
                int currentFrequent = map.get(params[i]);

                map.put(params[i], currentFrequent + 1);
            } else {
                map.put(params[i], 1);
            }
        }

        int mostFrequent = Short.MIN_VALUE;
        char result = params[0];

        for (Entry<Character, Integer> entrySet : map.entrySet()) {
            if (mostFrequent < entrySet.getValue()) {
                result = entrySet.getKey();

                mostFrequent = entrySet.getValue();
            }
        }

        // System.out.println();
        System.out.println("Result : ");

        return result;
    }

    static char randomChar(Random random) {
        char randomCharacter = (char) (random.nextInt(26) + 'a');

        return randomCharacter;
    }

    public static void main(String[] args) {
        Random random = new Random();

        char[] params = new char[10000000]; // 10^7

        // System.out.println("Generated Character : ");
        for (int i = 0; i < params.length; i++) {
        params[i] = randomChar(random);

        // System.out.print(params[i] + " ");
        }

        // System.out.println();
        System.out.println(lookUp(params));
    }
}