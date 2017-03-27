package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quickstart.FooService;
import quickstart.FooServiceImpl;

/**
 * Created by irvingsun on 17/3/27.
 */
public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        FooService fooService = (FooService) applicationContext.getBean("remoteService");
        System.out.println(fooService.hello("Irving Sun"));
    }
}
