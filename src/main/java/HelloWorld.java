/**
 * Created by Cédric on 4/28/2016.
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements ApplicationContextAware {
    private String name;
    private ClassToInject injectionTest;

    public HelloWorld(){} //We use this constructor to test singleton/prototype

    public HelloWorld(ClassToInject injectionTest){ //We use this constructor to test injection
        this.injectionTest = injectionTest;
        this.injectionTest.message();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMessage() {
        System.out.println("Your message : " + name);
    }

    public void init(){
        System.out.println("Initialization thanks to parameter in configuration file");
    }

    public void destroy(){
        System.out.println("Destruction thanks to parameter in configuration file");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //Here we have access to the ApplicationContext
    }
}

