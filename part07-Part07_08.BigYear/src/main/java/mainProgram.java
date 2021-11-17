import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        // Craete ArrayList to contain Bird Objects
        ArrayList<Bird> birdList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        // Start UI Loop.
        while (true) {
            
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                String commonName = scan.nextLine();
                System.out.println("Name in latin:");
                String latinName = scan.nextLine();
                birdList.add(new Bird(commonName, latinName));
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String birdObserved = scan.nextLine();
                for (Bird bird : birdList) {
                    if (bird.getCommonName().contains(birdObserved)) {
                        bird.Observation();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            } else if (command.equals("All")) {
                for (Bird bird : birdList) {
                    System.out.println(bird.toString());
                }
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String searchBird = scan.nextLine();
                for (Bird bird : birdList) {
                    if (bird.getCommonName().contains(searchBird)) {
                        System.out.println(bird.toString());
                    }
                }
            }
        }
    }

}
