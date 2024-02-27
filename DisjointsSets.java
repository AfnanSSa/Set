/* Disjoint Sets
 * Objective: Determine if two sets have no elements in common.
 * Problem Statement: Given two HashSet<String> objects containing names,
 * write a program to check if these sets are disjoint (have no elements
 * in common). Print "Disjoint" if they have no common elements; otherwise,
 * print "Not Disjoint".*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetTask {
    public static void main(String[] args) {
        //creating 3 sets
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new HashSet<>();

        //adding element the first set
        firstSet.addAll(Arrays.asList("Afnan", "Noura", "Tayba"));

        //adding elements to the second set
        secondSet.addAll(Arrays.asList("Balqees", "Shaimaa"));

        //checking if sets have elements in common
        Set<String> disjont = new HashSet<>(firstSet);
        disjont.retainAll(secondSet);

        if (disjont.isEmpty()){
            System.out.println("\nDisjoint");
        } else{
            System.out.println("\nNot Disjoint");
        }
    }
}