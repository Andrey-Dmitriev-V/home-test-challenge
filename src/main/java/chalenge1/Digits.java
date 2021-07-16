package chalenge1;

import java.util.*;

import static chalenge1.ErrorOptions.NULL_EXCEPTION_MESSAGE;

/**
 * Given two sets of numbers,
 *
 * set 1 = [3,5,768,3,6,23,98,38,32,45,34,234]
 *
 * set 2 = [10,12,43,74,25,56,37,98,29,10]
 *
 * get the most frequent digit, even if it is part of a number and how many times it repeats (two values)
 *
 * those will be the positions in the second list, sum values from those positions in second list
 */
public class Digits {

    public static Map.Entry<Integer,Integer> mostFrequentDigit(List<Integer> list) {
        if (Objects.isNull(list)) {
            throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE.toString());
        }
        int[] digitCounts = new int[10];
        for (Integer number : list) {
            char[] stringDigits = String.valueOf(number).toCharArray();
            for (char c : stringDigits) {
                int digit = Integer.parseInt(String.valueOf(c));
                digitCounts[digit]++;
            }
        }
        return getIndexWithMaxValue(digitCounts);
    }

    private static Map.Entry<Integer, Integer> getIndexWithMaxValue(int[] digitCounts) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (digitCounts[i] > max) {
                index = i;
                max = digitCounts[i];
            }
        }
        return Map.of(index,max).entrySet().iterator().next();
    }

    public static int sumByIndices(List<Integer> list, int number1, int number2) {
        return list.get(number1) + list.get(number2);
    }

    public static void main(String[] args) {
        System.out.println("3) Third challenge:");
        List<Integer> set1 = List.of(3,5,768,3,6,23,98,38,32,45,34,234);
        List<Integer> set2 = List.of(10,12,43,74,25,56,37,98,29,10);
        System.out.printf("From the set of integers:%n %s %n", set1);
        Map.Entry<Integer,Integer> result = mostFrequentDigit(set1);
        System.out.printf("One of the most frequent digits is %s which appeared %s times%n", result.getKey(),result.getValue());
        System.out.printf("The sum of the numbers in set: %s%n by the above indices is:%n", set2);
        System.out.println(sumByIndices(set2, result.getKey(),result.getValue()));
    }
}
