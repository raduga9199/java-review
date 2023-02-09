package W_02_Review;

public class Test {

    public static void main(String[] args) {
        new Mammal(5);
    }

}

//class Platypus extends Mammal {
    //public Platypus() {
                                            // compile error -> needs super(age)
    //    System.out.println("Platypus");
    //}

//}

class Mammal {

    public Mammal(int age) {
        System.out.println("Mammal");
    }

}
