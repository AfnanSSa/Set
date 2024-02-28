/* Intersection of Two Sets
* Objective: Implement logic to find the intersection of two Sets.
* Problem Statement: Given two HashSet<Integer> objects containing numbers,
* find and print the intersection (common elements) of these sets.*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetTask {
 public static void main(String[] args){
     //creating sets
     Set<Integer> firstSet = new HashSet<>();
     Set<Integer> secondSet = new HashSet<>();

     //adding element the first set
     firstSet.addAll(Arrays.asList(1, 2, 3, 4, 5));

     //adding elements to the second set
     secondSet.addAll(Arrays.asList(2, 6));

     //finding intersection of 2 sets
     Set<Integer> intSet = new HashSet<>(firstSet);
     intSet.retainAll(secondSet);
     System.out.println("\nIntersection of sets: " + intSet);
 }
}
