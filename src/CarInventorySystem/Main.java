package src.CarInventorySystem;

public class Main {
    public static void main(String[] args) {
        Car c1=new Sedan("3535","Ford","Escape",100000);
        System.out.println(c1.getInfo());

        Car c2=new Truck("84635","Ford","F-150",50000,5000);
        System.out.println(c2.getInfo());

        Car c3=new UtilityVehicle("7345","Polaris","Ranger",100,true);
        System.out.println(c3.getInfo());
    }
}
