package item.delivery.catalog.service;

import item.delivery.catalog.entity.Customer;
import item.delivery.catalog.exception.NotFoundException;
import item.delivery.catalog.mapper.CustomerMapper;
import item.delivery.catalog.model.CustomerDTO;
import item.delivery.catalog.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired (required = false)
    private CustomerMapper customerMapper;


    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerMapper.toModal(customerRepository.findAll());
    }

    @Override
    public CustomerDTO getCustomerById(long id) {
        return customerMapper.toModal(customerRepository.findById(id).orElseThrow(() -> new NotFoundException()));
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(long id, Customer customerDetails) {
        Customer customerUpdate = customerRepository.findById(id).orElseThrow(() -> new NotFoundException());
        customerUpdate.setName(customerDetails.getName());
        customerUpdate.setMoney(customerDetails.getMoney());
        customerRepository.save(customerUpdate);
        return customerUpdate;
    }

    @Override
    public void deleteTheCustomer(long id) {
        Customer customerDelete = customerRepository.findById(id).orElseThrow(() -> new NotFoundException());
        if (customerDelete != null){
            customerRepository.deleteById(id);
        }
    }
}
