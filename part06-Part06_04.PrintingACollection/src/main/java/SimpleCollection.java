
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "";
        if (this.elements.size() == 1) {
            output = "The collection " + this.name + " has 1 element:\n" + elements.get(0);
        } else if (this.elements.size() == 0) {
            output = "The collection " + this.name + " is empty.";
        } else {
            output = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
            for (String element : elements) {
                output += element + "\n";
            }
        }


        return output;
    }
    
}
