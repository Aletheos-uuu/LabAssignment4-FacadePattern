public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValetService(String plateNumber) {
        System.out.println("\nFrontDesk delegating valet request...");
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(int roomNumber) {
        System.out.println("\nFrontDesk delegating room cleaning request...");
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCarts) {
        System.out.println("\nFrontDesk delegating cart request...");
        cart.requestCart(numberOfCarts);
    }
}
