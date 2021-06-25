package item.delivery.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ItemDeliveryCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemDeliveryCatalogApplication.class, args);
    }

}
