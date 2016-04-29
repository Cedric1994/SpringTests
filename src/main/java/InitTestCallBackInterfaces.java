/**
 * Created by Cédric on 4/28/2016.
 */

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Initialization and destruction specific behavior trough Call Back Interfaces
 */
public class InitTestCallBackInterfaces implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Initialization thanks to the call back interface");
    }

    public void destroy() throws Exception
    {
        System.out.println("Destruction thanks to the call back interface");
    }
}
