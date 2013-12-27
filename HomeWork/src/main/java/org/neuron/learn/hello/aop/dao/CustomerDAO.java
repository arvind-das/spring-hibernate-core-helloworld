package org.neuron.learn.hello.aop.dao;

import org.neuron.learn.hello.aop.model.Customer;


public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
