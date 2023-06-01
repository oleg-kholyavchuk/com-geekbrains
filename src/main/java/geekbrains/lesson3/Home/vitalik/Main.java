package geekbrains.lesson3.Home.vitalik;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Human human = new Human("Den", 20, 10, 10);

        human.ageThrow();
        human.ageNotProcessed();

        try {
            human.heightThrow();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        human.widthThrow();
    }
}
