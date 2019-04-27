import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class Runner {

    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(context);
        xmlReader.loadBeanDefinitions("beans.xml");
        context.refresh();

        Person person = context.getBean("person", Person.class);
        person.speak();

        System.out.println(person.toString());

        context.close();
    }
}
