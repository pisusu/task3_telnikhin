package Task2;

import java.util.*;

public class NumbersSorter {
    private List<Integer> numbers;  // хранилище чисел

    public NumbersSorter() {
        numbers = new ArrayList<>();
    }

    // метод для считывания чисел
    public void readNumbers(Scanner scanner, int count) {
        for(int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    // метод для сортировки и вывода
    public void sortAndShow() {
        Collections.sort(numbers);  // сортируем
        System.out.println(numbers);  // выводим
    }
}
