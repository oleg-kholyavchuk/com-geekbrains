package geekbrains.lesson1;

import com.geekbrains.lesson1.animals.Animal;
import com.geekbrains.lesson1.animals.Cat;
import com.geekbrains.lesson1.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik", "White", 2, 10);
        Animal cat2 = new Cat("Murzik", "Black", 8, 7);
        Animal dog1 = new Dog("Bobik", "Black", 15);
        Cat cat = new Cat("dddd", "ddsdsds", 5,6);

//        cat1.info();
//        cat2.info();
//
//        cat1.voice();
//        dog1.voice();
//
//        Animal[] animals = new Animal[]{cat1, cat2, dog1};
//
//        for (Animal a: animals) {
//            a.voice();
//        }
//
//        Animal cat3 = new Dog("Mysia", "Orange", 1);
//
//        if(cat3 instanceof Cat) {
//            ((Cat) cat3).catMethod();
//        } else System.out.println("не кошка");
//
//        System.out.println("cat1.toString() = " + cat1);

        cat.meow();

        Box box1 = new Box("Green", 2);
        Box box2 = new Box("Green", 2);

        System.out.println(box1 == box2);
        System.out.println(box1.equals(box2));

        System.out.println("box1.hashCode() = " + box1.hashCode());

    }
}
