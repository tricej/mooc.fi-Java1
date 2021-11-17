import java.util.ArrayList;

public class gradeList {
    private ArrayList<Integer> grades;

    public gradeList() {
        this.grades = new ArrayList<Integer>();
    }

    // Method to add points to grade array
    public void addPoints(int points) {
        this.grades.add(points);
    }

    // return the average of all points added to the ArrayList
    public double averagePointsAll() {
        int sum = 0;
        for (int point : this.grades) {
            sum += point;
        }
        return 1.0 * sum / this.grades.size();
    }

    // return the average of all passing grades 
    public double averagePointsPassing() {
        int count = 0;
        int sum = 0;
        for (int point : this.grades) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return 1.0 * sum / count;
    }

    // return the percentage of passing grades
    public double passPercentage() {
        int passCount = 0;

        for (int point : this.grades) {
            if (point >= 50) {
                passCount++;
            }
        }
        if (passCount == 0) {
            return 0.0;
        }
        return 100.0 * passCount / this.grades.size();
    }

    // Print grade distribution
    public void printGradeDistribution() {
        String fives = "";
        String fours = "";
        String threes = "";
        String twos = "";
        String ones = "";
        String zeros = "";

        for (int point : this.grades) {
            if (point >= 90) {
                fives += "*";
            } else if (point >= 80) {
                fours += "*";
            } else if (point >= 70) {
                threes += "*";
            } else if (point >= 60) {
                twos += "*";
            } else if (point >= 50) {
                ones += "*";
            } else {
                zeros += "*";
            }
        }
        System.out.println("5: " + fives);
        System.out.println("4: " + fours);
        System.out.println("3: " + threes);
        System.out.println("2: " + twos);
        System.out.println("1: " + ones);
        System.out.println("0: " + zeros);                
    }
}