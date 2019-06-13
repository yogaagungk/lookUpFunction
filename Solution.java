import java.util.Arrays;
import java.util.Random;

/**
 * created by Yoga Agung created date 13/06/2019
 * 
 * function to search frequent element in an array
 */

class Solution {
    static char lookUp(char[] params) {
        Arrays.sort(params);

        int length = params.length;
        int mostFrequentEleme = 0;
        int currentFrequentElement = 0;

        char result = params[0];

        System.out.println("Sorted Character : ");

        for (int i = 1; i < length; i++) {
            System.out.print(params[i] + " ");

            if (params[i] == params[i - 1]) {
                currentFrequentElement++;
            } else {
                if (currentFrequentElement > mostFrequentEleme) {
                    mostFrequentEleme = currentFrequentElement;

                    result = params[i - 1];
                }

                currentFrequentElement = 1;
            }
        }

        if (currentFrequentElement > mostFrequentEleme) {
            mostFrequentEleme = currentFrequentElement;

            result = params[length - 1];
        }

        System.out.println();
        System.out.println("Result : ");

        return result;
    }

    static char randomChar(Random random) {
        char randomCharacter = (char) (random.nextInt(26) + 'a');

        return randomCharacter;
    }

    public static void main(String[] args) {
        Random random = new Random();

        char[] params = new char[10000000];

        System.out.println("Generated Character : ");
        for (int i = 0; i < params.length; i++) {
            params[i] = randomChar(random);

            System.out.print(params[i] + " ");
        }

        System.out.println();
        System.out.println(lookUp(params));
    }
}