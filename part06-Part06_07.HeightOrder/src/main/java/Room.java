import java.util.ArrayList;

public class Room {
    private ArrayList<Person> roomList;

    public Room() {
        this.roomList = new ArrayList<>();
    }

    public void add(Person person) {
        this.roomList.add(person);
    }

    public boolean isEmpty() {
        if (this.roomList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.roomList;
    }

    public Person take() {
        if (this.roomList.isEmpty()) {
            return null;
        }
        Person comparePerson = this.roomList.get(0);
        for (Person person : this.roomList) {
            if (comparePerson.getHeight() > person.getHeight()) {
                comparePerson = person;
            }
        }
        roomList.remove(comparePerson);
        return comparePerson;
    }

    public Person shortest() {
        if (roomList.isEmpty()) {
            return null;
        }
        Person comparePerson = this.roomList.get(0);
        for (Person person : this.roomList) {
            if (comparePerson.getHeight() > person.getHeight()) {
                comparePerson = person;
            }
        }
        return comparePerson;
    }
}
