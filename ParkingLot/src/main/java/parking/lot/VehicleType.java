package parking.lot;

public enum VehicleType {
    BIKE(10),
    CAR(20),
    TRUCK(30);

    private final int hourlyRate;

    VehicleType(int hourlyRate){
        this.hourlyRate=hourlyRate;
    }

    public int getHourlyRate(){
        return this.hourlyRate;
    }
}
