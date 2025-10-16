import java.util.Scanner;
public class HotelApp {
    private FrontDesk frontDesk;

    public HotelApp() {
        frontDesk = new FrontDesk();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HotelApp app = new HotelApp();
        
        System.out.println("\n----Hotel Service App----");
        
        System.out.print("\nEnter room number: ");
        int rNum = input.nextInt();

        char choice = '0';

        while(choice != '4'){

        System.out.print("\n1. Request Valet Service.\n2. Request Room Cleaning.\n3. Request Cart Service.\n4. Exit.\nEnter Choice: ");
        choice = input.next().charAt(0);

        if(choice == '1'){
            app.frontDesk.requestValetService("COA-123");
        }
        else if(choice == '2'){ 
            app.frontDesk.requestRoomCleaning(rNum);
        }
        else if(choice == '3'){
            System.out.print("Enter number of carts: ");
            int cNum = input.nextInt();
            app.frontDesk.requestCartService(cNum);
        }
        else if(choice == '4'){
            System.out.print("\nExiting application...\n");
            System.exit(0);
        }
        }
    }
}       
