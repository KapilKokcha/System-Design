package food.delivery;

import java.util.List;

public interface DeliveryPartnerMatchingStrategy {
    DeliveryPartner getDeliveryPartner(Order order, List<DeliveryPartner> deliveryPartners);
}
