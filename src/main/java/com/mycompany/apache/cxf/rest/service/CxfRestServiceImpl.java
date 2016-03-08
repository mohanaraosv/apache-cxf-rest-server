
package com.mycompany.apache.cxf.rest.service;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.apache.cxf.rest.dao.CustomerDao;
import com.mycompany.apache.cxf.rest.model.Customer;
import com.mycompany.apache.cxf.rest.ws.CxfRestService;

public class CxfRestServiceImpl implements CxfRestService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Response getCustomerDetail(String customerId) {
        if (customerId == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok(customerDao.getCustomerDetails(customerId)).build();
    }

    @Override
    public Response createCustomer(Customer customer) {
        if (customer == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok(customerDao.createCustomer(customer)).build();
    }
}