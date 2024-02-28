/* Frequency of List Elements
 * Objective: Use a Set to find the unique elements in a list and their frequencies.
 * Problem Statement: Given a List<Integer> that may contain duplicates, use a HashSet
 * to print each unique number along with the count of its occurrences in the list.*/

import java.util.*;

public class SetTask {
    public static void main(String[] args) {
        //creating a list
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 2, 3, 5, 5);

        //printing out the list
        System.out.println("\n" + numList);

        //creating a set to contain the list element
        Set<Integer> uniqueNum = new HashSet<>(numList);


        //finding the frequency using enhanced for loop
        for (Integer number : uniqueNum){
            Integer frequency = Collections.frequency(numList, number);
            System.out.println("\nNumber " + number + "\nFrequency: " + frequency);
        }
    }
}
