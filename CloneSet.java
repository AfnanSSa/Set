/* Clone a HashSet
 * Objective: Learn to create a shallow copy of a HashSet.
 * Problem Statement: Given a HashSet<String>, create a shallow copy
 * of this set and then add a new element to the copy. Verify by printing
 * both sets to observe that they are indeed separate.*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        //creating a set
        Set<String> originalSet = new HashSet<>();

        //adding elements to set
        originalSet.addAll(Arrays.asList("Afnan", "Tayba", "Noura", "Balqees"));

        //creating a new set to contain the first set
        Set<String> cloneSet = new HashSet<>(originalSet);
        //adding element to the copied set
        cloneSet.add("Shaimaa");

        //printing out sets
        System.out.println("\nOriginal set: " + originalSet);
        System.out.println("Cloned set: " + cloneSet);
    }
}
