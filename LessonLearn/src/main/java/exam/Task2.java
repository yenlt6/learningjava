package exam;


import java.util.*;

public class Task2 {


    public static void main(String[] args) {

        HashMap<Integer, Cat> mapCat1 = new HashMap<>();
        mapCat1 = (HashMap<Integer, Cat>) createMap();
        System.out.println("Danh sách của Cat: ");
        mapCat1.values().forEach(System.out::println);
//        printCats(convertMapToSet(createMap()));

    }

    public static Map<Integer, Cat> createMap() {
        //write your code here
        HashMap<Integer, Cat> mapCat = new HashMap<>();
        mapCat.put(1, new Cat("Tom1", 2));
        mapCat.put(2, new Cat("Tom2", 1));
        mapCat.put(3, new Cat("Tom3", 3));
        mapCat.put(4, new Cat("Tom4", 1));
        mapCat.put(5, new Cat("Tom5", 4));
        mapCat.put(6, new Cat("Tom6", 1));
        mapCat.put(7, new Cat("Tom7", 5));
        mapCat.put(8, new Cat("Tom8", 1));
        mapCat.put(9, new Cat("Tom9", 2));
        mapCat.put(10, new Cat("Tom10", 1));

        return mapCat;
    }

    public static Set<Cat> convertMapToSet(Map<Integer, Cat> map) {
        Set<Cat> catSet = new HashSet<>();
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            catSet.add(map.get(key));
        }
        return catSet;


    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats)
            System.out.println("Name: " + cat.getName() + " Age: " + cat.getAge());
    }


}
