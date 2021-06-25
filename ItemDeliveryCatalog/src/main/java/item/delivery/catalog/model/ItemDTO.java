package item.delivery.catalog.model;

import lombok.Data;

@Data
public class ItemDTO {
    private long id;
    private String title;
    private int price;
    private Boolean uniqueness;
    private int quantity;

}
