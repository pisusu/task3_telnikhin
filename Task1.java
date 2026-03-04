import java.util.Random;

// Элемент списка
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

// Класс Список
class MyList {
    Node first;

    // Добавление нового элемента в конец
    void addLast(int x) {
        Node node = new Node(x);
        if(first == null) {
            first = node;
        } else {
            Node last = first;
            while(last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    // Убирает отрицательные значения
    void deleteNegative() {
        while(first != null && first.data < 0) {
            first = first.next;
        }
        Node current = first;
        while(current != null && current.next != null) {
            if(current.next.data < 0) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // Показывает содержимое списка
    void show() {
        Node temp = first;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

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