package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
    private String storeId;
    private String customerId;

    public OrderRejected(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
