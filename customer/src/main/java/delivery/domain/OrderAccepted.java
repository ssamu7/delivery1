package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private Object options;
    private String storeId;
    private String customerId;
}


