package food.delivery;

import java.util.Comparator;
import java.util.List;

public class RatingBasedDPMS implements DeliveryPartnerMatchingStrategy {
    @Override
    public DeliveryPartner getDeliveryPartner(Order order, List<DeliveryPartner> deliveryPartners) {
        return deliveryPartners.stream()
            .filter(DeliveryPartner::isAvailable)
            .sorted(Comparator.comparingInt(DeliveryPartner::getRating).reversed())
            .findFirst().orElse(null);
    }
}
