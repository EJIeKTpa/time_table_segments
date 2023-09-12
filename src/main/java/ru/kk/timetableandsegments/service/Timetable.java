package ru.kk.timetableandsegments.service;

public class Timetable {
    public static void timetable() {
        int[] table = {2, 3, 4, 5};
        int[] table1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : table) {
            for (int j : table1) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println("----------");
        }
    }
}
