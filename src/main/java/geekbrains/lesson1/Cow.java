package geekbrains.lesson1;

import com.geekbrains.lesson1.animals.Animal;

public class Cow extends Animal {
    public Cow(String name, String color, int age) {
        super(name, color, age);
    }

    public void info(){
        System.out.println(name);
    }

    @Override
    public void voice() {

    }
}
