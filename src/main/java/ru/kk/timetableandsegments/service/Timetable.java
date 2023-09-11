package ru.kk.timetableandsegments.service;

public class Timetable {
    public static void timetable() {
        int[] table = {1, 2, 3, 4, 5};
        for (int i : table) {
            for (int j : table) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println("----------");
        }
    }
}
