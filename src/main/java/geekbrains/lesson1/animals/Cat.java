package geekbrains.lesson1.animals;

public class Cat extends Animal {
    int clawsLength;

    public Cat(String name, String color, int age, int clawsLength) {
        super(name, color, age);
        this.clawsLength = clawsLength;
    }

    public void meow(){
        System.out.println(name + "meow");
    }

    @Override
    public void voice() {
        System.out.println(name + " Mayyyyyyyyyyyyyyyyyyyy");
    }

    public void catMethod() {
        System.out.println(" Царап");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", clawsLength=" + clawsLength +
                '}';
    }
}
