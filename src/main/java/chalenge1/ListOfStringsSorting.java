package chalenge1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Write Code To Sort The List Of Strings
 */
public class ListOfStringsSorting {
    public static final List<String> LIST_OF_MONTHS = Arrays.asList("January", "February", "Mar", "Apr", "May",
            "June", "Jul","august", "Sep", "Oct", "nov", "December" );


    public static void main(String[] args) {
        Comparator<String> byStringSize = Comparator
                .comparing(String::length);

        System.out.println("2) Second challenge:");
        System.out.println("Sorted in alphabetical order regardless of capital and non capital letters");
        LIST_OF_MONTHS.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nSorted in alphabetical order considering capital and non capital letters");
        Collections.sort(LIST_OF_MONTHS);
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nSorted in String size order considering capital and non capital letters");
        LIST_OF_MONTHS.sort(byStringSize);
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nSorted in String size order regardless of capital and non capital letters");
        LIST_OF_MONTHS.sort(Comparator.comparing(String::toLowerCase, byStringSize));
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nReverse order");
        System.out.println("Sorted in reverse alphabetical order regardless of capital and non capital letters");
        LIST_OF_MONTHS.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nSorted in reverse alphabetical order considering capital and non capital letters");
        Collections.reverse(LIST_OF_MONTHS);
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nSorted in reverse String size order considering capital and non capital letters");
        LIST_OF_MONTHS.sort(byStringSize.reversed());
        System.out.println(LIST_OF_MONTHS);

        System.out.println("\nSorted in reverse String size order regardless of capital and non capital letters");
        LIST_OF_MONTHS.sort(Comparator.comparing(String::toLowerCase, byStringSize.reversed()));
        System.out.println(LIST_OF_MONTHS);
    }

}
