package item.delivery.catalog.mapper;

import item.delivery.catalog.entity.Customer;
import item.delivery.catalog.model.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO toModal(Customer customer);
    List<CustomerDTO> toModal(List<Customer> customerList);

//    public static CustomerDTO toModal(Customer customer){
//        CustomerDTO customerDTO = new CustomerDTO();
//        customerDTO.setId(customer.getId());
//        customerDTO.setName(customer.getName());
//        customerDTO.setMoney(customer.getMoney());
//        return customerDTO;
//    }
//    public static List<CustomerDTO> toModal(List<Customer> customerList){
//        List<CustomerDTO> customerDTOList;
//        customerDTOList = customerList.stream().map(CustomerMapper::toModal).collect(Collectors.toList());
//        return customerDTOList;
//    }
}
