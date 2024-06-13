package src.CarInventorySystem;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class Sedan extends Car{

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        String text;
        text="Car's Properties:\n"
        +"Vin Number: "
        +this.getVinNumber()+"\n"
        + "Make: "+this.getMake()+"\n"
        + "Model: "+this.getModel()+"\n"
        + "Mileage: "+this.getMileage()+"\n";
        return text;
    }
}
