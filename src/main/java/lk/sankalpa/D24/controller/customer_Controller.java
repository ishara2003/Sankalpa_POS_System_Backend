package lk.sankalpa.D24.controller;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import lk.sankalpa.D24.dto.CustomerDTO;
import lk.sankalpa.D24.sever.ServiceFactory;
import lk.sankalpa.D24.sever.ServiceTypes;
import lk.sankalpa.D24.sever.customer.CustomerService;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class customer_Controller extends HttpServlet {

private CustomerService customerService;
    public void init() {
        System.out.println("Came To Init Method");
        customerService= ServiceFactory.getInstance().getService(ServiceTypes.CUSTOMER);

    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Came to DoPost Methode");
        Jsonb jsonb = JsonbBuilder.create();
        CustomerDTO customerDTO = jsonb.fromJson(request.getReader(), CustomerDTO.class);
        System.out.println(customerDTO);
        customerService.saveCustomer(new CustomerDTO(
               customerDTO.getNic(),
               customerDTO.getName(),
               customerDTO.getAddress(),
               customerDTO.getNumber()));

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Came to doPut Methode");

        Jsonb jsonb = JsonbBuilder.create();
        CustomerDTO customerDTO = jsonb.fromJson(req.getReader(), CustomerDTO.class);
        customerService.updateCustomer(new CustomerDTO(
                customerDTO.getNic(),
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getNumber()
        ));


    }

    public void destroy() {

    }
}