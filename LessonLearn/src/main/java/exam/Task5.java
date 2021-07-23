package exam;

import java.util.*;

/**
 Create a set of numbers (Set<Integer>) and add 10 different numbers to it.
 Remove from the set all numbers greater than 10 .
 Requirements:
 •Create createSet() method to create and return a HashSet containing 10 different numbers.
 •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        Set<Integer> intSet = new HashSet<>();
        intSet =task5.createSet();
        task5.removeAllNumbersGreaterThan10(intSet);
    }


    public Set<Integer> createSet() {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(20);
        intSet.add(21);
        intSet.add(5);
        intSet.add(8);
        intSet.add(15);
        intSet.add(26);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        System.out.println("trước khi remove: " + intSet);
        return intSet;
    }
    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            if (iter.next()>10){
                iter.remove();
            }
        }
        System.out.println("sau khi remove: " + set);
        set.forEach(System.out::println);

        return set;
    }

}