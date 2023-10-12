package hello.itemservice.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {
    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach(){
        itemRepository.clearStore();
    }
    @Test
    void save() {
    Item item = new Item( "itemA", 10,111 ,"fajklejlkajf");

        Item savedItem = itemRepository.save(item);

        Item findItem = itemRepository.findById(item.getId());
        assertThat(findItem).isEqualTo(savedItem);
    }
    @Test
    void findById() {
    }

    @Test
    void findAll() {
        Item item1 = new Item( "item1", 10,111 ,"fajklejlkajf");
        Item item2 = new Item( "item2", 1220,111 ,"fvvvajklejlkajf");

        itemRepository.save(item1);
        itemRepository.save(item2);

        List<Item> result = itemRepository.findAll();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(item1, item2);

    }

    @Test
    void update() {
        Item item = new Item( "item1", 10,111 ,"fajklejlkajf");
        Item savedItem = itemRepository.save(item);
        Long itemId = savedItem.getId();

        Item updateParam = new Item( "item2", 103,111 ,"fajklddejlkajf");
        itemRepository.update(itemId, updateParam);

        Item findItem = itemRepository.findById(itemId);

        assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
        assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
        assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());
        assertThat(findItem.getContents()).isEqualTo(updateParam.getContents());

    }

    @Test
    void clearStore() {
    }
}