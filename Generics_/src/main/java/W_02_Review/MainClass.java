package W_02_Review;

public class MainClass {

    public static void main(String[] args) {

        Y.staticMethod();

    }

}

class X {

    static final void staticMethod() {
        System.out.println("Class X");
    }

}

class Y extends X {

    // final method cannot be changed while initialized

    //static void staticMethod() {
    //    System.out.println("Class Y");
    //}

}
