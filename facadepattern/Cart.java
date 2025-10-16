public class Cart implements HotelService {

    @Override
    public void performService() {
        System.out.println("Providing cart service...");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage cart(s).");
    }
}
