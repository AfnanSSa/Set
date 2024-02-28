/* Union of Multiple Sets
 * Objective: Combine multiple sets into one.
 * Problem Statement: Given three HashSet<Integer> objects containing numbers,
 * find and print the union (all unique elements combined) of these sets.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetTask {
    public static void main(String[] args) {
        //creating sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        Set<Integer> thirdSet = new HashSet<>();


        //adding elements to each set
        firstSet.addAll(Arrays.asList(1, 2, 3, 4, 5));
        secondSet.addAll(Arrays.asList(6, 7, 8, 9, 10));
        thirdSet.addAll(Arrays.asList(20, 30, 40, 50));

        //creating set to contain the union of all three sets
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(firstSet);
        unionSet.addAll(secondSet);
        unionSet.addAll(thirdSet);

        //printing out results
        System.out.println("\nFirst set: " + firstSet);
        System.out.println("\nSecond set: " + secondSet);
        System.out.println("\nThird set: " + thirdSet);
        System.out.println("\nUnion of all sets: " + unionSet);

    }
}