package lk.sankalpa.D24.sever.customer;

import lk.sankalpa.D24.dto.CustomerDTO;
import lk.sankalpa.D24.sever.SuperService;

public interface CustomerService extends SuperService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);

}
