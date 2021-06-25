package item.delivery.catalog.controller;

import item.delivery.catalog.entity.Customer;
import item.delivery.catalog.model.CustomerDTO;
import item.delivery.catalog.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable("id") long id){
        return customerService.getCustomerById(id);
    }
    @PostMapping("/new")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.saveNewCustomer(customer);
    }
    @PutMapping("/update/{id}")
    public Customer updateTheCustomer(@PathVariable("id") long id, @RequestBody Customer customer){
        return customerService.updateCustomer(id, customer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCustomerById(@PathVariable long id){
        customerService.deleteTheCustomer(id);
    }

}
