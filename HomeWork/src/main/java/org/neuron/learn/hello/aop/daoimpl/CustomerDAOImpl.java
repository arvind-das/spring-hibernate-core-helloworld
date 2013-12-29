package org.neuron.learn.hello.aop.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.neuron.app.utils.HibernateUtil;
import org.neuron.learn.hello.aop.dao.CustomerDAO;
import org.neuron.learn.hello.aop.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Will now set customer information");
		customer.setCity("Gurgaon");
		customer.setPhone("9990549");
		customer.setName("Neuron ");
		
        SessionFactory sf=HibernateUtil.getSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(customer);
        
        tx.commit();
	}

	public Customer findByCustomerId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
