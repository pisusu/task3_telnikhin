package Task4;

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
