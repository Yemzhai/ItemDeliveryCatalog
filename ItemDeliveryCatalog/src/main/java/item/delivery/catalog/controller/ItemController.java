package item.delivery.catalog.controller;

import item.delivery.catalog.entity.Item;
import item.delivery.catalog.model.ItemDTO;
import item.delivery.catalog.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public List<ItemDTO> getAllItems(){
        return itemService.getAllItems();
    }
    @GetMapping("/{id}")
    public ItemDTO getItemById(@PathVariable("id") long id){
        return itemService.getItemById(id);
    }
    @PostMapping("/new")
    public Item createItem(@RequestBody Item item){
        return itemService.saveNewItem(item);
    }
    @PutMapping("/update/{id}")
    public Item updateTheItem(@PathVariable("id") long id, @RequestBody Item item){
        return itemService.updateItem(id, item);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteItemById(@PathVariable long id){
        itemService.deleteTheItem(id);
    }

}
