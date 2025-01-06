package parking.lot;

public abstract class Gate {
    protected final int id;

    public Gate(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
