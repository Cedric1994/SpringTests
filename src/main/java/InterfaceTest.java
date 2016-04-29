import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Cédric on 4/29/2016.
 */
public class InterfaceTest {

    /**
     * Try to autowire the variable using the Interface
     */
    @Autowired
    @Qualifier("ImplementationInterfaceA")
    Interface interfaceWired;


    public void setInterface(Interface interfaceWired){
        this.interfaceWired = interfaceWired;
    }

    public void run(){
        interfaceWired.displayName();

    }


}
