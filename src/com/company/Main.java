package com.company;

import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Дней для доставки " + calculateDeliveryDays(90));
        printIsLeapYear(2020);
        validateString("abc");
        validateString("abcc");

        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        revertArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    // задача 1
    public static void printIsLeapYear(int year) {
        boolean leapYear = Year.isLeap(year);
        if (leapYear) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }

    }
    // задача 2
    public static void printVersion(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версия для iOS");
            } else {
                System.out.println("Установите версию для iOS");
            }

        } else {
            if (deviceYear >= currentYear) {
                System.out.println("Установите облегченную версия для Android");
            } else {
                System.out.println("Установите версия для Android");
            }

        }
    }
    // задача 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays ++;
        }

        if (deliveryDistance > 60) {
            deliveryDays ++;
        }

        return deliveryDays;
    }

    // задача 4
    public static void validateString(String str) {
        char[] letters = str.toCharArray();
        char prevChar = Character.MIN_VALUE;

        for (char c : letters) {
            if (c == prevChar) {
                System.out.println("Дубликат найден: " + c);
                return;
            }
            prevChar = c;
        }
        System.out.println("Дубликатов не найдено");

    }

    // задача 5
    public static void revertArray(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int head = 0;
        int tail = arr.length - 1;

        while (head < tail) {
            int tmp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = tmp;
        }

    }
}
