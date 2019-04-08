import lombok.Setter;
import lombok.ToString;

import java.sql.SQLOutput;

@ToString
@Setter
public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
