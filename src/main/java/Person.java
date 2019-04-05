import lombok.ToString;

import java.sql.SQLOutput;

@ToString
public class Person {
    private int id;
    private String name;

    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello");
    }

}
