package geekbrains.lesson3;

import com.geekbrains.lesson3.Home.MyArrayDataException;
import com.geekbrains.lesson3.Home.MyArraySizeException;
import com.geekbrains.lesson3.Home.MyException;

public class MainApp3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] arrayStr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arrayStr2 = {{"1", "2", "3"}, {"5", "6", "7"}, {"9", "10", "11"}};
        String[][] arrayStr3 = {{"1", "2", "3"}, {"5", "6", "7"}, {"9", "10", "11"}, {"13", "14", "15"}};

        try {
            System.out.println("twoDimensionalArray(arrayStr1) = " + twoDimensionalArray(arrayStr1, 4));
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static int twoDimensionalArray(String[][] str, int numArray) {
        int num = 0;

        if (str.length != numArray) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[j].length != numArray) {
                    throw new MyArraySizeException();
                }
                try {
                    num += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return num;
    }
}
