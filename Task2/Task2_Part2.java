package Task2;

import java.util.Scanner;

public class Task2_Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // считываем количество чисел
        int n = scanner.nextInt();

        // создаём объект помощника
        UniqueNumbersSorter sorter = new UniqueNumbersSorter();

        // считываем числа
        sorter.readNumbers(scanner, n);

        // выводим уникальные отсортированные числа
        sorter.showUniqueSorted();
    }
}