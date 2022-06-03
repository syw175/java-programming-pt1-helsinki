
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object person) {
        if (this == person) {
            return true;
        } if (!(person instanceof Person)) {
            return false;
        }
        Person comparedPerson = (Person) person;

        if (comparedPerson.name.equals(this.name) && comparedPerson.birthday.equals(this.birthday)
        && comparedPerson.height == (this.height) && comparedPerson.weight == (this.weight)) {
            return true;
        }
        return false;

    }
}
