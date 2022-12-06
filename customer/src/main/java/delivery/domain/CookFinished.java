package delivery.domain;

import delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
    private String storeId;
}
