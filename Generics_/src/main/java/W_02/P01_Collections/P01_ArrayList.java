package W_02.P01_Collections;

import java.util.*;

public class P01_ArrayList {
    public static void main(String[] args) {
        List<P_Student> students = new LinkedList<>();
        students.add(new P_Student(1,"Jose"));
        students.add(new P_Student(2,"Saved"));
        students.add(new P_Student(3,"Nick"));
        students.add(new P_Student(4,"Ronnie"));

        System.out.println(students);
        System.out.println("==============================");

        // 1. For loop with get(index)
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));

        System.out.println("==============================");
        // 2. Iterator -->Forward Iteration

        Iterator iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("==============================");

        // 2. Iterator -->Backward Iteration
        while (((ListIterator<?>) iterator).hasPrevious()){
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        System.out.println("==============================");

        // 3. for each
        for (P_Student each : students)System.out.println(each);

        System.out.println("==============================");

        // 4. Lambda
        System.out.println("lambda");
        students.forEach(each -> System.out.println(each));

        System.out.println("==============================");
        System.out.println("Sorting elements in List");

        // 4. Sorting elements in List

        System.out.println("Sort by ID");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);
        System.out.println("-----");

        System.out.println("Sort by NAME");

        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);




    }
    static class sortByIdDesc implements Comparator<P_Student>{
        @Override
        public int compare(P_Student o1, P_Student o2){
            return o1.id - o2.id;
        }
    }
    static class sortByNameDesc implements Comparator<P_Student>{
        public int compare(P_Student o1, P_Student o2){
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
