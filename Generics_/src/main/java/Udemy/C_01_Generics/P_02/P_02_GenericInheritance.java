package Udemy.C_01_Generics.P_02;

import java.util.ArrayList;
import java.util.List;

public class P_02_GenericInheritance{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(2.3);
        printList(numbers);

        printNumbers(numbers);


    }
    public static  void printNumbers(List<? extends Number> numbers){
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }

    public static  void printList(List<?> list){
        list.forEach(System.out::println);
    }
}
