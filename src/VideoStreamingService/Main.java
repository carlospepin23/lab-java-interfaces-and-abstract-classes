package src.VideoStreamingService;

import src.CarInventorySystem.Car;
import src.CarInventorySystem.Sedan;
import src.CarInventorySystem.Truck;
import src.CarInventorySystem.UtilityVehicle;

public class Main {
    public static void main(String[] args) {
        Video v1=new Movie("Bad Boys 4",111,3.0);
        System.out.println(v1.getInfo());

        Video v2=new TvSeries("How I Met Your Mother",20,22);
        System.out.println(v2.getInfo());

    }
}