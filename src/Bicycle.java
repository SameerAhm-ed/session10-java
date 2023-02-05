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

        TwoWheeler obj = new Bicycle(args[0], args[1], Integer.parseInt(args[2]), Float.parseFloat(args[3]), Boolean.parseBoolean(args[4]));
        obj.printDetails();
    }


}
