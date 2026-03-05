package Task1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        MyList list = new MyList();
        Random r = new Random();

        // создание 23 случайных целых числа от −100 до 100
        for(int i=0; i<23; i++) {
            list.addLast(r.nextInt(201)-100);
        }

        // удаление отрицательных элементов
        list.deleteNegative();

        // проверка оставшихся элементов
        if(list.first==null) {
            System.out.println("Удалено 10-й элемент.");
        } else {
            list.show();
        }
    }
}
