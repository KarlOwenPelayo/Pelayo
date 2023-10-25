import java.util.Scanner;

public class FirstLastNameDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Suffix: ");
        String suffix = scanner.nextLine();

        FirstLastName name = new FirstLastName(firstName, middleName, lastName, suffix);
        System.out.println("Full Name: " + name.getFullName());
    }
}