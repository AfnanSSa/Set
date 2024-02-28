/* Set of Sets
 * Objective: Explore working with a Set containing other Sets.
 * Problem Statement: Create a HashSet<HashSet<Integer>>, add several
 * HashSet<Integer> objects to it, and then write a program to print
 * all the unique integers from all sets combined.*/


import java.util.HashSet;
import java.util.Set;
import java.lang.Integer;

public class SetTask {
    public static void main(String[] args) {
        //creating sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        Set<Integer> thirdSet = new HashSet<>();
        Set<Set<Integer>> nestedSet = new HashSet<>(); //set of sets

        /*adding elements for each set*/
        //fist set
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        //second set
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);
        secondSet.add(7);
        //third set
        thirdSet.add(8);
        thirdSet.add(9);
        thirdSet.add(1);

        /*adding sets to the nested set*/
        nestedSet.add(firstSet); //adding first set
        nestedSet.add(secondSet); //adding second set
        nestedSet.add(thirdSet); //adding third second set

        //creating HashSet<> to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        //finding unique elements using for loop
        for (Set<Integer> set : nestedSet) {
            uniqueElements.addAll(set);
        }

        System.out.println("\nUnique Elements: " + uniqueElements);
    }
}