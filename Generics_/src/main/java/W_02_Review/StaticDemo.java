package W_02_Review;

public class StaticDemo {

        static String n1 = examName("O");

        {
            examName("A");
        }

        static {
            examName("C");
        }

        public static String examName(String str) {
            System.out.println(str);
            return str;
        }

        public static void main(String[] args) {
            StaticDemo sd = new StaticDemo();
        }


        StaticDemo sd = new StaticDemo();

        void method1() {
            method4();                  // Line 1
            StaticDemo.method2();       // Line 2
            // --> compile error - StaticDemo.method3();       // Line 3
        }

        static void method2() {}

        void method3() {
            method1();                  // Line 4
            method2();                  // Line 5
            sd.method4();               // Line 6
        }

        static void method4() {}





}
