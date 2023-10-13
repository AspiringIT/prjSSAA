public class IntSelectionSorter {
//Unused code used to sort the entire array
    public static void selectionSort(int []AccountNumbers){
        int startscan = 0;
        int index = 0;
        int minindex;
        int minvalue;


        for(index = startscan = 0; startscan<((AccountNumbers.length)-1); startscan++){
            minindex = startscan;
            minvalue = AccountNumbers[startscan];

            for (index = startscan + 1; index <AccountNumbers.length; index++){
                if(AccountNumbers[index]<minvalue)
                {
                    minvalue = AccountNumbers[index];
                    minindex = index;
                }
            }

            AccountNumbers[minindex] = AccountNumbers[startscan];
            AccountNumbers[startscan] = minvalue;
        }
    }
}
