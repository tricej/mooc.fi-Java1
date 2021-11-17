import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface (TodoList todoList,Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String addition = scanner.nextLine();
                this.todoList.add(addition);
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.println("While one is removed? ");
                int toBeRemoved = Integer.valueOf(scanner.nextLine());
                todoList.remove(toBeRemoved);
            }
        }
    }

}
