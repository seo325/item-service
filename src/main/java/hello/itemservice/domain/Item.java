package hello.itemservice.domain;

public class Item {

    private Long id;
    private String itemName;
    private Integer price;

    private Integer quantity;

    private String contents;

    public Item(Long id, String itemName, Integer price, Integer quantity, String contents) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.contents = contents;
    }
}
