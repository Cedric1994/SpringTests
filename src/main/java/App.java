/**
 * Created by Cédric on 4/28/2016.
 */

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main App with the main method which runs all the tests
 */
public class App {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //Hello world test the ApplicationContextAware, custom behavior or initialization and destruction, and the general creation of a bean
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printMessage();

        //We test here the autowire and manage multi implementation of an interface
        System.out.println("\n------------ Test of the interface autowire ----------------\n");

        InterfaceTest interfaceTest = (InterfaceTest) context.getBean("InterfaceTest");
        interfaceTest.run();


        //We test here the custom behavior or initialization and destruction of beans
        InitTestCallBackInterfaces initTestCallBackInterfaces = (InitTestCallBackInterfaces) context.getBean("InitTestCallBackInterfaces");
        InitTestAnnotation initTestAnnotation = (InitTestAnnotation) context.getBean("InitTestAnnotation");





        System.out.println("\n------------ Test of different scopes ----------------\n");

        HelloWorld singleton = (HelloWorld) context.getBean("helloBeanSingleton"); //default scope is singleton
        HelloWorld prototype = (HelloWorld) context.getBean("helloBeanPrototype");

        singleton.setName("I'm a singleton");
        prototype.setName("I'm a prototype");
        singleton.printMessage();
        prototype.printMessage();

        HelloWorld singleton2 = (HelloWorld) context.getBean("helloBeanSingleton");
        HelloWorld prototype2 = (HelloWorld) context.getBean("helloBeanPrototype");

        singleton2.printMessage();
        prototype2.printMessage();

        System.out.println("\n------------ End of tests, we close the context ----------------\n");


        ((ConfigurableApplicationContext)context).close();

    }
}
