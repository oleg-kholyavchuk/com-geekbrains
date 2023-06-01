package geekbrains.lesson4.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = {"a", "b"};
        List<String> list;

        System.out.println("array = " + Arrays.toString(array));
        reversArray(array);
        System.out.println("array = " + Arrays.toString(array));

        list = arrayToArrayList(array);

        System.out.println("list = " + list);
        list.add("c");
        list.add("d");
        System.out.println("list = " + list);

        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);
        Apple apple3 = new Apple(1);
        Apple apple4 = new Apple(2);
        Apple apple5 = new Apple(2);
        Apple apple6 = new Apple(2);
        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);

        Box<Apple> fruitBoxApple = new Box();
        Box<Apple> fruitBoxApple2 = new Box();
        Box<Orange> fruitBoxOrange = new Box();

        fruitBoxApple.add(apple1);
        fruitBoxApple.add(apple2);
        fruitBoxApple.add(apple3);

        fruitBoxOrange.add(orange1);
        fruitBoxOrange.add(orange2);

        System.out.println("fruitBoxApple.compare(fruitBoxOrange) = " + fruitBoxApple.compare(fruitBoxOrange));

        fruitBoxApple2.add(apple4);
        fruitBoxApple2.add(apple5);
        fruitBoxApple2.add(apple6);

        System.out.println("fruitBoxApple = " + fruitBoxApple.size());

        fruitBoxApple.addAll(fruitBoxApple2);

        System.out.println("fruitBoxApple = " + fruitBoxApple.size());



        System.out.println("fruitBoxApple.getWeight(apple, 3) = " + fruitBoxApple.getWeight(apple1, 30));
        System.out.println("fruitBoxOrange.getWeight(orange, 2) = " + fruitBoxOrange.getWeight(orange1, 2));
    }
    public static void reversArray(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            String temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
