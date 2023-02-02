public class TwoWheeler {
    String vehicleId;
    String type;
    int wheels;
    float price;

    public TwoWheeler(String vId, String vType, int tyres, float rate) {
        vehicleId = vId;
        type = vType;
        wheels = tyres;
        price = rate;
    }

    public void printDetails() {
        System.out.println("Bicycle Id: " + vehicleId);
        System.out.println("Bicycle Type: " + type);
        System.out.println("Wheels: " + wheels);
        System.out.println("Price: $" + price);
    }

}
