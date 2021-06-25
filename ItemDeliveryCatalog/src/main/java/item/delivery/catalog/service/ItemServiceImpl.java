package item.delivery.catalog.service;

import item.delivery.catalog.entity.Item;
import item.delivery.catalog.exception.NotFoundException;
import item.delivery.catalog.mapper.ItemMapper;
import item.delivery.catalog.model.ItemDTO;
import item.delivery.catalog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired (required = false)
    private ItemMapper itemMapper;

    @Override
    public List<ItemDTO> getAllItems() {
        return itemMapper.toModal(itemRepository.findAll());
    }

    @Override
    public ItemDTO getItemById(long id) {
        return itemMapper.toModal(itemRepository.findById(id).orElseThrow(() -> new NotFoundException()));
    }

    @Override
    public Item saveNewItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(long id, Item itemDetails) {
        Item itemUpdate = itemRepository.findById(id).orElseThrow(() -> new NotFoundException());
        itemUpdate.setTitle(itemDetails.getTitle());
        itemUpdate.setUniqueness(itemDetails.getUniqueness());
        itemUpdate.setQuantity(itemDetails.getQuantity());
        itemRepository.save(itemUpdate);
        return itemUpdate;
    }

    @Override
    public void deleteTheItem(long id) {
        Item itemDelete = itemRepository.findById(id).orElseThrow(() -> new NotFoundException());
        if (itemDelete != null){
            itemRepository.deleteById(id);
        }
    }
}
