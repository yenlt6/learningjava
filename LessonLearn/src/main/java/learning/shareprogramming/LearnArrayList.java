package learning.shareprogramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearnArrayList {
    //    public static void main(String[] args) {
//        List<Income> arr = new ArrayList<>();
//        arr.add(new Income("ELCA", "HGA", 20000000, LocalDate.of(2019, 1, 1)));
//        arr.add(new Income("KMS", "VVH", 100000000, LocalDate.of(2019, 1, 1)));
//        arr.add(new Income("ELCA", "AKG", 200000000, LocalDate.of(2019, 5, 1)));
//        arr.add(new Income("FPT", "FGH", 1000000, LocalDate.of(2019, 9, 1)));
//
//        System.out.println("Thong tin gui tien cua cong ty ELCA");
//        List<Income> imcomes1 = arr.stream().filter(i -> i.getSender().equals("ELCA"))
//                .collect(Collectors.toList());
//        imcomes1.forEach(i -> System.out.println(i.toString()));
//        System.out.println("------------------------------------------------");
//
//        System.out.println("Thong tin cac giao dich ngay 01-01-2019");
//        List<Income> imcomes2 = arr.stream().filter(i -> i.getDate().equals(LocalDate.of(2019, 1, 1)))
//                .collect(Collectors.toList());
//        imcomes2.forEach(i -> System.out.println(i.toString()));
//    }

//    public static void main(String[] args) {
//        List<Income> arr = new ArrayList<>();
//        arr.add(new Income("ELCA", "HGA", 20000000, LocalDate.of(2019, 1, 1)));
//        arr.add(new Income(null, "VVH", 100000000, LocalDate.of(2019, 1, 1)));
//        arr.add(new Income("ELCA", "AKG", 200000000, LocalDate.of(2019, 5, 1)));
//        arr.add(new Income("FPT", "FGH", 1000000, LocalDate.of(2019, 9, 1)));
//        // Filter truoc cac gia tri null
//        List<Income> imcomes1 = arr.stream()
//                .filter(i -> i.getSender() != null)
//                .filter(i -> i.getSender().equals("ELCA")).collect(Collectors.toList());
//        imcomes1.forEach(i -> System.out.println(i.toString()));
//        System.out.println("-----------------------------------------------");
//        // Ket hop dieu kien null
//        List<Income> imcomes2 = arr.stream()
//                .filter(i -> i.getSender() != null && i.getSender().equals("ELCA"))
//                .collect(Collectors.toList());
//        imcomes2.forEach(i -> System.out.println(i.toString()));
//    }

}
