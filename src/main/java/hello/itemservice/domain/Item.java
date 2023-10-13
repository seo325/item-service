package hello.itemservice.domain;

import lombok.Data;

@Data
public class Item {

    private Long id;

    private String itemName;

    private Integer price;

    private Integer quantity;

    private String contents;

    public Item( String itemName, Integer price, Integer quantity, String contents) {

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.contents = contents;
    }

    public Item() {
    }
}
