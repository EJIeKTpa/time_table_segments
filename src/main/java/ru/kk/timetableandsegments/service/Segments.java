package ru.kk.timetableandsegments.service;

import java.util.Scanner;

public class Segments {
    public static void segments() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x1 для точки A: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите координату y1 для точки A: ");
        int y1 = scanner.nextInt();
        System.out.println("Введите координату x2 для точки B: ");
        int x2 = scanner.nextInt();
        System.out.println("Введите координату y2 для точки B: ");
        int y2 = scanner.nextInt();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Длина отрезка AB: " + distance);
    }

    private static double calculateDistance(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        return distance;
    }
}
