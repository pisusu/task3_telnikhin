package Task1;

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
