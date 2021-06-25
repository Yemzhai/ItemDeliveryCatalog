package item.delivery.catalog.repository;

import item.delivery.catalog.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
