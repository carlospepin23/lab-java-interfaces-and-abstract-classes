package src.CarInventorySystem;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fwd) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fwd);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
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
                + "Four Wheel Drive: "+this.isFourWheelDrive()+"\n";
        return text;
    }
}
