package org.neuron.app.home;

import org.neuron.learn.hello.aop.dao.CustomerDAO;
import org.neuron.learn.hello.aop.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class AopApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      ApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
      CustomerDAO customerDao = (CustomerDAO)ctx.getBean("proxyBean");
      Customer customer = new Customer();
      customerDao.insert(customer);
        System.out.println("city set is "+customer.getCity());
        System.out.println("id set is "+customer.getId());
        System.out.println("name set is "+customer.getName());
    }
}
