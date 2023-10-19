import java.util.Scanner;

public class SouthBusTerminal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double distance = 0.0;
        double cityToCarcar = 37.9, carcarToMoalboal = 46.7, carcarToSibonga = 12.5, sibongaToMoalboal1 = 42.9, sibongaToMoalboal2 = 45.7;

        System.out.print("Enter Speed (km/hr): ");
        double speed = obj.nextDouble();

        System.out.println("Select a Route:");
        System.out.println("[1] Route 1");
        System.out.println("[2] Route 2");
        System.out.println("[3] Route 3");        
        
        byte choice = obj.nextByte();
        // Add a variable to check if Barili is blocked
        int isBariliBlocked = -1; // Initialize to -1 for unknown

        if (choice == 1) {
            System.out.println("Is Barili blocked? (1 for yes, 0 for no):");
            isBariliBlocked = obj.nextInt();
        }

        switch (choice) {
            case 1:
                System.out.println("Start");
                System.out.println("Cebu City");
                System.out.println("Minglanilla");
                System.out.println("San Fernando");
                System.out.println("Carcar");
                System.out.println("Sibonga");
                System.out.println("Dumanjug");
                System.out.println("Alcantara");
                System.out.println("Moalboal");
                distance = 84.9; // Set the distance to 84.9 km
                break;
            case 2:
                System.out.println("Start");
                System.out.println("Cebu City");
                System.out.println("Minglanilla");
                System.out.println("San Fernando");
                System.out.println("Carcar");
                System.out.println("Sibonga");
                System.out.println("Sibonga To Moalboal");
                System.out.println("Moalboal");
                distance = cityToCarcar + carcarToSibonga + sibongaToMoalboal2;
                break;
            case 3:
                System.out.println("Start");
                System.out.println("Cebu City");
                System.out.println("Minglanilla");
                System.out.println("San Fernando");
                System.out.println("Carcar");
                System.out.println("Sibonga");
                System.out.println("Dumanjug");
                System.out.println("Alcantara");
                System.out.println("Moalboal");
                distance = cityToCarcar + carcarToSibonga + sibongaToMoalboal1;
             }

        System.out.println();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Speed: " + speed + " km/hr");

        int hours = (int) (distance / speed);
        int minutes = (int) ((distance % speed) * 60 / speed);
        System.out.println("ETA: " + hours + " HR " + minutes + " min");

        // Display whether Barili is blocked or not
        if (choice == 1) {
            if (isBariliBlocked == 1) {
                System.out.println("Barili is blocked.");
            } else if (isBariliBlocked == 0) {
                System.out.println("Barili is not blocked.");
            } else {
                System.out.println("Unknown status for Barili.");
            }
        }
    }
}