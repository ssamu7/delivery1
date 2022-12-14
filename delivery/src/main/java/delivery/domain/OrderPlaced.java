package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String customerId;
    private String storeId;
    private Integer pickOrDeliver;
    private String pick;
}


