package geekbrains.lesson1.animals;

public abstract class Animal {
    protected String name;
    protected String color;
     int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal() {

    }

    public void info(){
        System.out.println(name + " " + color + " " + age);
    }

    public abstract void voice();

    public static void doSomething(){
        System.out.println();
    }
}
