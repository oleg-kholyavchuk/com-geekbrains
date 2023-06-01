package geekbrains.lesson5.home;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] str = new String[]{"Аббат", "Аббатиса", "Аббатство", "Аббиссинцы", "Аббревиатура"
                , "Аберрация", "Абзац", "Абитуриент", "Абонемент", "Абонент", "Абонировать", "Обветрить"
                , "Обветриться", "Обветшалый", "Обветшать", "Обвешать", "Обвеять", "Обвинение", "Обвинитель"
                ,  "Аббатиса", "Аббатство", "Аббиссинцы", "Обвешать", "Обвеять"};

        System.out.println("Arrays = " + Arrays.toString(Arrays.stream(str).distinct().toArray(String[]::new)));


        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Fillips", "+7-4434-34-656");
        telephoneDirectory.add("Fillips", "+7-4434-34-6544446");
        telephoneDirectory.add("Fil", "+7-4446");
        telephoneDirectory.add("Fil", "+7");

        System.out.println("telephoneDirectory.get(\"Fillips\") = " + telephoneDirectory.get("Fillips"));
        System.out.println("telephoneDirectory.get(\"Fil\") = " + telephoneDirectory.get("Fil"));
    }
}
