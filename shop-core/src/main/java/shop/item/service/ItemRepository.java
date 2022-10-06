package shop.item.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.entity.Item;
import shop.entity.User;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Long> {
}
