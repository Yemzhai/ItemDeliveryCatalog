package item.delivery.catalog.model;

import item.delivery.catalog.entity.Item;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerDTO {
    private long id;
    private String name;
    private int money;
    private Set<Item> items;
}
