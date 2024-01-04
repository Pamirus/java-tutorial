public class Methods {
    public static void main(String[] args) {
        findNumber();
    }
    
    public static void findNumber() {
        int[] myNumberArray = new int[] { 1, 2, 5, 7, 9, 0 };
        int findNumber = 6;

        boolean isExistingInArray = isExisting(myNumberArray, findNumber);
        
        printMessage(isExistingInArray);
    }

    public static boolean isExisting(int[] myNumberArray, int findNumber )
    {
        boolean isExistingNumber = false;
        for (int number : myNumberArray) {
            if (number == findNumber) {
                isExistingNumber = true;
                break;
            }
        }

        return isExistingNumber;
    }

    public static void printMessage(boolean isExistingNumber) {
        String myMessage = "The desired number DOES NOT exist in the array.";
        if (isExistingNumber) {
            myMessage = "The desired number exist in the array.";
        }
        
        System.out.println(myMessage);
    }
}
