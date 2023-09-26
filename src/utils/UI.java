package utils;

import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;

public class UI {
    public static Scanner sc = new Scanner(System.in);

    public static void printMenu(List<String> menuItems, boolean hasExit) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + menuItems.get(i));
        }
        if (hasExit) {
            System.out.println("[0] Exit");
        }
    }

    public static void printMenu(String title, List<String> menuItems) {
        printMenu(title, menuItems, false);
    }

    public static void printMenu(String title, List<String> menuItems, boolean hasExit) {
        System.out.println(title);
        printMenu(menuItems, hasExit);
    }

    public static void printBoxedHeader(String str) {
        int length = str.length();
        StringBuilder line = new StringBuilder("+");
        line.append("-".repeat(Math.max(0, length + 2)));
        line.append("+");
        System.out.println(line);
        System.out.println("| " + str + " |");
        System.out.println(line);
    }

    public static String joinStrings(String... strings) {
        return String.join(", ", strings);
    }

    public static int parseNonNegativeInt(String str) {
        try {
            int num = Integer.parseInt(str);
            return num >= 0 ? num : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static boolean inRange(String str, int min, int max) {
        int num = parseNonNegativeInt(str);
        if (min < 0 || max < 0) throw new IllegalArgumentException("min and max must be non-negative");
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return num >= min && num <= max;
    }
}
