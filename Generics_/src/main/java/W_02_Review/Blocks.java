package W_02_Review;

public class Blocks {
    {
        System.out.println("A");
    }
    static {
        System.out.println("B");
    }
    {
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();

        System.out.println(c);

    }
}

class A{
    {
        System.out.println("1");
    }
}

class B extends A{
    static {
        System.out.println("2");
    }
}

class C extends B{
     {
        System.out.println("3");
    }
}