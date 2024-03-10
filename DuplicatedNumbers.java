/* Find the Duplicate Number
 * Objective: Identify the duplicate number in an array with n+1 integers, each between 1 and n.

 * Explanation: This problem teaches you how to use data structures like arrays and sets to track
 * seen numbers, and how to apply logical conditions to identify duplicates. It's a good exercise
 * in understanding array traversal and set operations.

 * Analogy: Imagine you're throwing a huge party, and you've invited exactly n guests. Each guest
 * receives an invite with a unique number from 1 to n. But, oops! Due to a mix-up, one extra guest
 * sneaks in with a duplicate invite number. Your job is to find out which number got copied.*/

import java.util.*;
public class DuplicateNumbers {
    public static void main(String[] args) {
        //creating an array
        Integer[] numArray = {1, 2, 3, 4, 5, 6, 6, 7};
        //creating set
        Set<Integer> numSet = new HashSet<>(); //a set to contain the array elements

        numSet.addAll(List.of(numArray)); //adding array element to the set 

        if (numArray.length > numSet.size()){
            //if array size is greater than numSet size
            System.out.println("\nThere are duplicated number(s)");

        }else {
            //if array size is less or equal than numSet size
            System.out.println("\nNo duplicates found!");
        }
    }
}
