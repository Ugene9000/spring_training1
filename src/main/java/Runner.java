import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");

        Person person = (Person) context.getBean("person");
        person.speak();
        System.out.println(person.toString());

        ((ClassPathXmlApplicationContext)context).close();
    }
}
