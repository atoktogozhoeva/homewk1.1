package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameOfStudent = "Alim";
        final int NUM = 5;
        String word = "Student";
        System.out.println(nameOfStudent + NUM + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        String word2 = "Привет ";
        System.out.println( word2 + name );
    }

}
