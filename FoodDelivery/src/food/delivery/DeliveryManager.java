package food.delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DeliveryManager {

	private static volatile DeliveryManager instance;
	private final List<DeliveryPartner> partners = new CopyOnWriteArrayList<>();

	private DeliveryManager() {
	}

	public static DeliveryManager getInstance() {
		if (instance == null) {
			synchronized (DeliveryManager.class) {
				if (instance == null)
					instance = new DeliveryManager();
			}
		}
		return instance;
	}

	public void registerPartner(DeliveryPartner partner) {
		partners.add(partner);
	}

	public DeliveryPartner assignPartner(Order order) {
		DeliveryPartnerMatchingStrategy strategy = new RatingBasedDPMS();
		return strategy.getDeliveryPartner(order, partners);
	}

}
