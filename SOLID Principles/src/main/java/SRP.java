// It states that class should have a single responsibility
public class SRP {

}

class Marker {
    String name;
    //Getter setter
}

class Invoice {
    int quantity;
    int price;

    public Invoice(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int calculatePrice() {
        return quantity * price;
    }
}

class SaveToDB {
    public void save(Invoice invoice) {
        // logic
    }
}
