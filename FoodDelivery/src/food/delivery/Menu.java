package food.delivery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {
	private final List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return Collections.unmodifiableList(dishes);
    }
}
