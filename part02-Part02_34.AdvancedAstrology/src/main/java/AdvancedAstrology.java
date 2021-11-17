
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int j = size; j > 0; j--) {
            printSpaces(j - 1);
            for (int k = size; k >= j; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
  

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int j = height; j > 0; j--) {
            printSpaces(j - 1);
            for (int k = height; k >= j; k--) {
                System.out.print("*");
            }
            for (int k = height - 1; k >= j; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 2; i > 0; i--) {
            for (int l = height -2; l > 0; l--) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printSpaces(1);
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
