package geekbrains.lesson3.Home.vitalik;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Human {
    private String name;
    private int age;
    private int height;
    private int width;

    public void ageThrow() {
        try {
            if (age > 0 && age < 150) {
                System.out.println("Correct age");
            } else {
                throw new RuntimeException("Age is not correct");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ageNotProcessed()throws Error {
        if (age > 0 && age < 100) {
            System.out.println("Correct age");
        } else {
            throw new StackOverflowError("Age is not correct");
        }
    }

    public void heightThrow() throws Throwable {
        if (height > 0 && height < 300) {
            System.out.println("Correct growth");
        } else {
            throw new Exception("Growth is not correct");
        }
    }

    public void widthThrow() throws Throwable {
        if (width >0 && width < 100) {
            System.out.println("Correct width");
        } else {
            throw new Error("Width is not correct");
        }
    }
}
