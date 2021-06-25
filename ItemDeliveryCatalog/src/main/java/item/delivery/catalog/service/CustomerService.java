package item.delivery.catalog.service;

import item.delivery.catalog.entity.Customer;
import item.delivery.catalog.model.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(long id);
    Customer saveNewCustomer(Customer customer);
    Customer updateCustomer(long id, Customer customerDetails);
    void deleteTheCustomer(long id);
}
