public class isVaild {
    public static boolean isValidAccount(int accountNumber) {
        for (int num : Main.AccountNumbers) {//goes through each item in array to check for value
            if (num == accountNumber) {
                return true; // Number is valid
            }
        }
        return false; // Number is not in the list
    }
}
