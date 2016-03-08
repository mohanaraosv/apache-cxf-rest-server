
package com.mycompany.apache.cxf.rest.ws;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mycompany.apache.cxf.rest.model.Customer;

/**
 * 
 * @author mohanarao_sv
 * 
 * This is interface for the customer services
 *
 */
@Path("/")
@WebService(name = "customerService", targetNamespace = "http://localhost:9090/customer/example")
public interface CxfRestService {

    @GET
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/getCustomerDetails")
    public Response getCustomerDetail(@QueryParam("customerId") String customerId);

    @PUT
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/createCustomer")
    public Response createCustomer(Customer customer);

}