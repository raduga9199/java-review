package W_02.P01_Collections;

import java.util.HashSet;
import java.util.Set;

public class P02_Set {
    public static void main(String[] args) {
        Set<P_Student> mySet = new HashSet<>();
        mySet.add(new P_Student(7,"Ibadet"));
        mySet.add(new P_Student(8,"Ahmet"));
        mySet.add(new P_Student(9,"Muhambet"));
        mySet.add(new P_Student(9,"Muhambet"));
        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println("==========================");

        String str = "Java Developer";

        System.out.println("First repeating char is: " + firstRepeatingChar(str));

    }

    public static Character firstRepeatingChar(String str){
        Set<Character> chars = new HashSet<>();

        for (Character each : str.toCharArray()) if (!chars.add(each)) return each;
        return null;
    }
}
