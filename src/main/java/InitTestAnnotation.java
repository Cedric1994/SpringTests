/**
 * Created by Cédric on 4/28/2016.
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Change initialization and destruction through annotation
 */
public class InitTestAnnotation{

    @PostConstruct
    public void init() throws Exception
    {
        System.out.println("Initialization thanks to the annotation");
    }

    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println("Destruction thanks to the annotation");
    }

}
