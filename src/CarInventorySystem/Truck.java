package src.CarInventorySystem;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class Truck extends Car {

    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double tc) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(tc);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        String text;
        text="Car's Properties:\n"
                +"Vin Number: "
                +this.getVinNumber()+"\n"
                + "Make: "+this.getMake()+"\n"
                + "Model: "+this.getModel()+"\n"
                + "Mileage: "+this.getMileage()+"\n"
                + "Towing Capacity: "+this.getTowingCapacity()+"\n";
        return text;
    }
}
