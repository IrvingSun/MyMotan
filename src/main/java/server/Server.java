package server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by irvingsun on 17/3/27.
 */
public class Server {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_service.xml");
        System.out.println("Server start...");
    }
}
