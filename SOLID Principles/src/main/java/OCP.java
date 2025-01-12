// Open closed principle, i.e. Open for extension, closed for change
// We want to save the invoice to a file also
public class OCP {
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

interface saveInvoice {
    void save(Invoice invoice);
}


class SaveToDB implements saveInvoice {
    @Override
    public void save(Invoice invoice) {
        // logic
    }
}

class SaveToFile implements saveInvoice {
    @Override
    public void save(Invoice invoice) {
        // logic
    }
}

