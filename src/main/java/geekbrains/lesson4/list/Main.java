package geekbrains.lesson4.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listArray = new ArrayList<>(Arrays.asList("ZZ", "AAA", "BBBBB", "B", "B", "C", "D"));
        List<String> listLinked = new LinkedList<>();
//        System.out.println("listArray.get(7) = " + listArray.get(7));
//        System.out.println("list = " + listArray);
//        while (list.remove("B")) ;
//        System.out.println("list = " + listArray);

//        Collections.sort(listArray);
//        System.out.println("list = " + listArray);

        listArray.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println("list = " + listArray);
    }
}
