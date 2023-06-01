package geekbrains.lesson4.generic;

public class Main {
    public static void main(String[] args) {
//        SimpleBox simpleBox1 = new SimpleBox(10);
//        SimpleBox simpleBox2 = new SimpleBox(20);
//
////        simpleBox1.setOdj("Java");
//
//        if(simpleBox1.getOdj() instanceof Integer && simpleBox2.getOdj() instanceof Integer) {
//            int sum = (Integer) simpleBox1.getOdj() + (Integer) simpleBox2.getOdj();
//            System.out.println("sum = " + sum);
//        } else System.out.println("Error");

//        GenBox<String> stringGenBox  = new GenBox<>("java");
//        GenBox<Integer> integerGenBox1 = new GenBox<>(10);
//        GenBox<Integer> integerGenBox2 = new GenBox<>(20);
//
//        integerGenBox1.setObj(55);
//
//        int sum = integerGenBox1.getObj() + integerGenBox2.getObj();
//        System.out.println("sum = " + sum);

//        BoxWithNumber<Integer> integerBoxWithNumber1 = new BoxWithNumber<>(1, 2, 3, 4);
//        BoxWithNumber<Integer> integerBoxWithNumber2 = new BoxWithNumber<>(1, 2, 3, 4);
//        BoxWithNumber<Float> floatBoxWithNumber = new BoxWithNumber<>(1.0f, 2.0f, 3.0f, 4.0f);
////        BoxWithNumber<String> stringBoxWithNumber;
//
//        System.out.println("integerBoxWithNumber.average() = " + integerBoxWithNumber1.average());
//        System.out.println("floatBoxWithNumber.average() = " + floatBoxWithNumber.average());
//
//        System.out.println("integerBoxWithNumber1.compareAverage(integerBoxWithNumber2) = " + integerBoxWithNumber1.compareAverage(integerBoxWithNumber2));
//
//        System.out.println("integerBoxWithNumber1.compareAverage(floatBoxWithNumber) = " + integerBoxWithNumber1.compareAverage(floatBoxWithNumber));
//
//        GenBox<Number> genBox = new GenBox<>(1);
//        GenBox<Integer> integerGenBox = new GenBox<>(1);
//        doSomething1(genBox);
//        doSomething2(genBox);
//
//        doSomething1(integerGenBox);
//        doSomething2(integerGenBox);

        method1(new int[]{1, 2, 3, 4, 5});
        method2(1, 2, 3, 4, 5);
    }

    public static void method1(int[] array) {

    }

    public static void method2(int... array) {

    }
//    public static <T extends Number> T getFirstElement(List<?> list) {
//        return list.get(0);
//    }

    public static void doSomething1(GenBox<? extends Number> box) {

    }

    public static void doSomething2(GenBox<Number> box) { // любой класс либо его наследник

    }

    public static void doSomething3(GenBox<? super Number> box) { // любой класс либо его родитель

    }
}
