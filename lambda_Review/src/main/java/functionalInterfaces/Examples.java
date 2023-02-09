package functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {
        //*******PREDICATE************
        /*
        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 18;
            }
        };

        lesserThan.test(50);
         */

        Predicate<Integer> lesserThan = a -> a < 18; // Implementation of test method that belongs to Predicate Interface
        System.out.println(lesserThan.test(50));


        //*******CONSUMER************
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //*******BI-CONSUMER************
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x + " " + y);
        addTwo.accept(100,200);


    }
}
