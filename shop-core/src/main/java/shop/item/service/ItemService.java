package shop.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.user.service.UserRepository;

@Service("itemService")
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
}
