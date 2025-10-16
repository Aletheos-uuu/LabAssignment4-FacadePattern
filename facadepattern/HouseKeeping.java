public class HouseKeeping implements HotelService {

    @Override
    public void performService() {
        System.out.println("Performing housekeeping service...");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }
}
