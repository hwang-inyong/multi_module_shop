package shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import shop.constant.ItemSellStatus;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "TB_ITEM")
@Table(name = "TB_ITEM")
public class Item {
    @Id
    @Column(name = "ITEM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;

    @Column(name = "ITEM_NAME", length = 50, nullable = false)
    private String itemName;

    @Column(name = "PRICE", nullable = false)
    private int price;

    @Column(name = "STOCK_NUMBER", nullable = false)
    private int stockNumber;

    @Column(name = "ITEM_DETAIL", length = 200)
    private String itemDetail;

    @Enumerated(EnumType.STRING)
    @Column(name = "ITEM_SELL_STATUS", length = 8, nullable = false)
    private ItemSellStatus itemSellStatus;

    @CreationTimestamp
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @UpdateTimestamp
    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;
}
