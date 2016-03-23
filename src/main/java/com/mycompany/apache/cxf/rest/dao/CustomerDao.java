
package com.mycompany.apache.cxf.rest.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.apache.cxf.rest.model.Customer;

/**
 * @author mohanarao_sv
 *
 */
@Repository
public class CustomerDao {

    public static Logger logger = LoggerFactory.getLogger(CustomerDao.class);

    /**
     * Method to get customer information based on user input
     * 
     * @param customerId
     * @return customer
     */
    public Customer getCustomerDetails(String customerId) {
        Customer cust = new Customer();
        cust.setDateOfJoining("25-02-2015");
        cust.setDepartment("Pre-Sales");
        cust.setEmail("test@gmail.com");
        cust.setCustomerId("675436");
        cust.setFirstName("David");
        cust.setLastName("Bechman");
        return cust;
    }

    /**
     * Method to display customer information, which is supposed to be stored in database
     * 
     * @param customer
     * @return customer
     */
    public Customer createCustomer(Customer customer) {
        logger.info("Customer Date of Joining : {}", customer.getDateOfJoining());
        logger.info("Customer Department : {}", customer.getDepartment());
        logger.info("Customer Email address : {}", customer.getEmail());
        logger.info("Customer id {} ", customer.getCustomerId());
        logger.info("Customer first name : {}", customer.getFirstName());
        logger.info("Customer last name : {}", customer.getLastName());
        return customer;
    }
}