package geekbrains.lesson2;

public class AnotherMainApp {

   static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            Inner inner = new Inner(10);
        }

        int outerValue;
    }

    public static void main(String[] args) {

        Month month =  Month.April;

        Inner inner = new Inner(10);

        class Point {
            int x;

            public Point(int x) {
                this.x = x;
            }

            public void info() {
                System.out.println(x);
            }
        }

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {

            }
        };

        System.out.println(flyable.getClass().getName());
        System.out.println(flyable.getClass().getName());

    }
}
