package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // количество револьверов в магазине
        int s = scanner.nextInt(); // количество долларов у ковбоя Джо

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt(); // цены револьверов в магазине
        }

        Arrays.sort(prices); // сортируем цены по возрастанию

        int maxAffordable = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] <= s) {
                maxAffordable = prices[i]; // находим максимальную цену, которую ковбой Джо может себе позволить
            }
        }

        System.out.println(maxAffordable);
    }
}
