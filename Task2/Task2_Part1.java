package Task2;

import java.util.Scanner;

public class Task2_Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // считываем количество чисел
        int n = scanner.nextInt();

        // создаём объект помощника
        NumbersSorter sorter = new NumbersSorter();

        // считываем числа
        sorter.readNumbers(scanner, n);

        // сортируем и выводим
        sorter.sortAndShow();
    }
}