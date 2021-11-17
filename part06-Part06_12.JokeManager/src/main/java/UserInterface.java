import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    } 

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                jokeManager.addJoke(newJoke);
            } else if (input.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (input.equals("3")) {
                jokeManager.printJokes();
            } else {
                continue;
            }
        }
    }
}
