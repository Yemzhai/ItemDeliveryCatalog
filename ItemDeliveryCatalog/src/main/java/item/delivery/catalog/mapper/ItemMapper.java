package item.delivery.catalog.mapper;

import item.delivery.catalog.entity.Item;
import item.delivery.catalog.model.ItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);
    ItemDTO toModal(Item item);
    List<ItemDTO> toModal(List<Item> itemList);

//    public static ItemDTO toModal(Item item){
//        ItemDTO itemDTO = new ItemDTO();
//        itemDTO.setId(item.getId());
//        itemDTO.setTitle(item.getTitle());
//        itemDTO.setUniqueness(item.getUniqueness());
//        itemDTO.setQuantity(item.getQuantity());
//        return itemDTO;
//    }
//    public static List<ItemDTO> toModal(List<Item> itemList){
//        List<ItemDTO> itemDTOList;
//        itemDTOList = itemList.stream().map(ItemMapper::toModal).collect(Collectors.toList());
//        return itemDTOList;
//    }
}
