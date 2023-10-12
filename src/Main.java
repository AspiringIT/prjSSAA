import java.util.Scanner;
public class Main {
    public static int[] AccountNumbers = {
            5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
            8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
            1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);

        System.out.println("Original Order: ");
        for (int element : AccountNumbers)
            System.out.print(element + " ");

        IntSelectionSorter.selectionSort(AccountNumbers);
        System.out.println("\nSorted Order");
        for (int element2 : AccountNumbers){
            System.out.print(element2 + " ");

            //System.out.println();
        }

    }

    /*public void setAccountNumbers(int[] accountNumbers) {
        AccountNumbers = accountNumbers;
    }*/

   /* public int[] getAccountNumbers() {
        return AccountNumbers;
    }*/

    }

