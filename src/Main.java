import java.util.Scanner;

public class Main {
    public static int[] AccountNumbers = {
            5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
            8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
            1005231, 6545231, 3852085, 7576651, 7881200, 4581002
    };

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a charge account number");
        int requestedNum = keyboard.nextInt();

        boolean isValid = isValidAccount(requestedNum);

        if (isValid) {
            System.out.println("This a a valid account number");
        } else {
            System.out.println("This is an invalid account number.");
        }


    }

    public static boolean isValidAccount(int accountNumber) {
        for (int num : AccountNumbers) {
            if (num == accountNumber) {
                return true; // Number is valid
            }
        }
        return false; // Number is not in the list
    }


}
