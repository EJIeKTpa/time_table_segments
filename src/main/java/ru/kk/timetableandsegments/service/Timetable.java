package ru.kk.timetableandsegments.service;
import java.util.Scanner;

public class Timetable {
    public static void timetable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (x) от 2 до 5: ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число (y) от 2 до 5: ");
        int y = scanner.nextInt();

        for (int i = 1; i <= y; i++) {
            int result = x * i;
            System.out.println(x + " * " + i + " = " + result);
        }
    }
}
