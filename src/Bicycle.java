public class Bicycle extends TwoWheeler{

    boolean gear;

    public Bicycle(String vId, String vName, int tyres, float price, boolean paramgear) {
        super(vId, vName, tyres, price);
        gear = paramgear;
    }

    @Override
    public void printDetails() {
        if (gear) {
            super.printDetails();
            System.out.println("Geared: Yes");
        } else {
            System.out.println("Geared: No");
        }
    }

    public static void main(String[] args) {
        TwoWheeler obj = new Bicycle("B001", "Mountain-Bicycle", 2, 200, true);
        obj.printDetails();
    }


}
