package org.neuron.app.home;

import java.util.Date;

import org.neuron.learn.hello.aop.dao.CustomerDAO;
import org.neuron.learn.hello.aop.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.org.neuron.hello.Profile;
import com.org.neuron.hello.User;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
        User user1 = (User)ctx.getBean("user");
        User user2 = (User)ctx.getBean("user");
        System.out.println("user 1:"+user1+"and user 2: "+user2);
        //System.out.println("username : "+user.getUsername() + "  Email : "+user.getEmail()+"  phone : "+user.getPhone());
        Profile profile1 = user1.getProfile();
        Profile profile2 = user2.getProfile();
      profile1.setBirthDate(new Date());
      profile1.setCity("Faridabad");
      profile2.setBirthDate(new Date());
      profile2.setCity("Gurgaon");
      System.out.println("profile 1 city  is"+user1.getProfile().getCity());
      System.out.println("profile 2 city  is"+user2.getProfile().getCity());
        
    }
}
