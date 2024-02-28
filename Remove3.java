/* Remove If
 * Objective: Practice removing an element from a Set.
 * Problem Statement: Create a Set of integers, add some numbers to it,
 * and then remove the number 3. Print the Set before and after the removal.*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        //creating a set
        Set<Integer> numSet = new HashSet<>();

        //adding elements to the set
        numSet.addAll(Arrays.asList(1, 2, 3, 4,5));

        //printing set before removing 3
        System.out.println("\nSet before removing 3: "+ numSet);

        //removing 3
        numSet.remove(3);

        //printing set after removing 3
        System.out.println("\nSet after removing 3: " + numSet);
    }
}