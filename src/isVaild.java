public class isVaild {
    public static boolean isValidAccount(int accountNumber) {
        for (int num : Main.AccountNumbers) {
            if (num == accountNumber) {
                return true; // Number is valid
            }
        }
        return false; // Number is not in the list
    }
}
