package chalenge1;

import java.util.HashSet;
import java.util.Objects;

import static chalenge1.ErrorOptions.NULL_EXCEPTION_MESSAGE;


public class LongestUniqueSubstring {

    /**
     * A Program To Find The Longest Substring From A Given Text Which Doesn’t Contain Any Duplicated Characters.
     */
    public static String extractSubstring(String input) {
        if (Objects.isNull(input)) {
            throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE.toString());
        }
        int inputStringSize = input.length();
        if (inputStringSize < 2) {
            return input;
        }
        int firstIndex = 0;
        int maxSubstringSize = 0;
        char[] chars = input.toCharArray();
        HashSet<Character> seen;
        for (int i = 0; i < (inputStringSize - maxSubstringSize);i++) {
            seen = new HashSet<>();
            for (int j = i; j < inputStringSize; j++) {
                char a = chars[j];
                if (seen.contains(a)) {
                    break;
                }
                seen.add(a);
                if (maxSubstringSize < seen.size()) {
                    firstIndex = i;
                    maxSubstringSize = seen.size();
                }
            }
        }
        return input.substring(firstIndex,firstIndex + maxSubstringSize);
    }

    public static void main(String[] args) {
        String testString = "Everyone needs a classic chocolate chip cookie recipe in their repertoire, but where to" +
                " find a good one? Not only good one, the seriously Best Chocolate Chip Cookie Recipe Ever!\"??";
        System.out.println("1) First challenge:");
        System.out.printf("From the sentence:%n %s%n",testString);
        System.out.println("The first longest unique substring is:");
        System.out.printf("'%s'", extractSubstring(testString));
    }
}
