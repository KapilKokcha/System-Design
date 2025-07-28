package food.delivery;

import java.util.List;

public class OrderSizeBaseDPMS implements DeliveryPartnerMatchingStrategy {

	@Override
	public DeliveryPartner getDeliveryPartner(Order order, List<DeliveryPartner> deliveryPartners) {
		// Make it thread safe
		for (DeliveryPartner deliveryPartner : deliveryPartners) {
			if (deliveryPartner.isAvailable()) {
				return deliveryPartner;
			}
		}
		return null;
	}

}
