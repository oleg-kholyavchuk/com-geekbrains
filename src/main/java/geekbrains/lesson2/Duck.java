package geekbrains.lesson2;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {

    }
}
