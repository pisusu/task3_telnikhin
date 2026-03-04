// Элемент списка
class TaskItem {
    String description;
    TaskItem next;

    TaskItem(String desc) {
        this.description = desc;
    }
}

// Класс трекера
class TaskTracker {
    TaskItem first;

    // добавляет новую задачу в конец списка
    void addTask(String task) {
        TaskItem item = new TaskItem(task);
        if(first == null) {
            first = item;
        } else {
            TaskItem current = first;
            while(current.next != null) {
                current = current.next;
            }
            current.next = item;
        }
    }

    // выводит первые N задач
    void showTasks(int limit) {
        TaskItem current = first;
        int count = 0;
        while(count < limit && current != null) {
            System.out.println((count+1)+": "+current.description);
            current = current.next;
            count++;
        }
    }

    // удаляет выполненную задачу
    void completeTask(String task) {
        if(first == null || !first.description.equals(task)) {
            TaskItem previous = first;
            TaskItem current = first.next;

            while(current != null && !current.description.equals(task)) {
                previous = current;
                current = current.next;
            }

            if(current != null) {
                previous.next = current.next;
            }
        } else {
            first = first.next;
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();

        tracker.addTask("Купить хлеб");
        tracker.addTask("Сделать уроки");
        tracker.addTask("Почистить обувь");
        tracker.addTask("Позвонить другу");
        tracker.addTask("Выгулять собаку");

        tracker.showTasks(3);

        tracker.completeTask("Сделать уроки");
        tracker.showTasks(3);
    }
}
