/* Remove Elements Not in Another Set
 * Objective: Practice modifying a Set based on another Set.
 * Problem Statement: Given a HashSet<Integer> and another HashSet<Integer>,
 * modify the first set to remove all elements that are not found in the second set.*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetTask {
    public static void main(String[] args) {
        //creating 3 sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        //adding element the first set
        firstSet.addAll(Arrays.asList(1, 2, 3, 4));

        //adding elements to the second set
        secondSet.addAll(Arrays.asList(4, 5, 6, 7));
	
	//printing sets
        System.out.println("\nFirst set: " + firstSet);
        System.out.println("\nSecond set: " + secondSet);

        //modify first set to remove elements that are not found in second set
        firstSet.retainAll(secondSet);

        //print result
        System.out.println("\nFirst set after modification: " + firstSet);
    }
}
