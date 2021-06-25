package item.delivery.catalog.service;


import item.delivery.catalog.entity.Item;
import item.delivery.catalog.model.ItemDTO;

import java.util.List;

public interface ItemService {
    List<ItemDTO> getAllItems();
    ItemDTO getItemById(long id);
    Item saveNewItem(Item item);
    Item updateItem(long id, Item itemDetails);
    void deleteTheItem(long id);
}
