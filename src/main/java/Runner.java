import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/beans/beans.xml");

        Person person = (Person) context.getBean("person");
        person.speak();

        System.out.println(person.toString());

        ((FileSystemXmlApplicationContext)context).close();
    }
}
