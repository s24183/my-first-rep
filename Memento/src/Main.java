public class Main {
    public static void main(String[] args) {
        UserOriginator todoList = new UserOriginator();

        UserCaretaker caretaker = new UserCaretaker();

        todoList.setState("Task 1");
        System.out.println("Current To-Do List: " + todoList.getState());

        caretaker.saveMemento(todoList.createMemento());

        todoList.setState("Task 1, Task 2, Task 3");
        System.out.println("Updated To-Do List: " + todoList.getState());

        caretaker.saveMemento(todoList.createMemento());

        todoList.restore(caretaker.getMemento(0));
        System.out.println("Restored To-Do List: " + todoList.getState());

        todoList.restore(caretaker.getMemento(1));
        System.out.println("Restored To-Do List: " + todoList.getState());
    }
}
