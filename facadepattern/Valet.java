public class Valet implements HotelService {

    @Override
    public void performService() {
        System.out.println("Performing valet service...");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle with plate number: " + plateNumber);
    }
}
