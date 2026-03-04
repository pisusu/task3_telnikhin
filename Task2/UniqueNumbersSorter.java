package Task2;

import java.util.*;

public class UniqueNumbersSorter {
    private Set<Integer> numbers;  // хранилище уникальных чисел

    public UniqueNumbersSorter() {
        numbers = new TreeSet<>();  // автоматически сортирует и исключает дубликаты
    }

    // метод для считывания чисел
    public void readNumbers(Scanner scanner, int count) {
        for(int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    // метод для вывода уникальных чисел
    public void showUniqueSorted() {
        System.out.println(numbers);  // выводим отсортированные уникальные числа
    }
}
