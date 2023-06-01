package geekbrains.lesson3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp2 {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("1.txt");
            fileOutputStream.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream fileOutputStream2 = new FileOutputStream("1.txt");
             FileOutputStream input = new FileOutputStream("2.txt")) {

        } catch (IOException e) {

        }


//        try {
//            int x = 10/0;
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            System.out.println("Exception");
//        } finally {
//            System.out.println(1);
//        }

//        try {
//            ReportMaker.makePDFReport("1.txt", "text");
//        } catch (IOException e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.showAndWait();
//        }

//        int x = 10/0;

//        try {
//            FileOutputStream outputStream = new FileOutputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        System.out.println(1);
        int coef = 0;
        try {
            coef = sqrt(-100);
        } catch (ArithmeticException e) {
            coef = 7;
        }

        try {

        } catch (RuntimeException e) {
            System.out.println(1);
            throw new ArithmeticException();
        }

        System.out.println("doSomething2() = " + doSomething2());

//        throw new RuntimeException("Runtime Exception");
    }

    public static void doSomething1() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
    }

    public static int doSomething2() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static int sqrt(int num) {
        if(num < 0) {
            throw new ArithmeticException(("It is impossible to take the root of a negative number"));
        }
        return num / 2;
    }
}
