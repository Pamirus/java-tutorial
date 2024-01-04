public class findNumber {

    public static void main(String[] args) {
        int[] myNumberArray = new int[] { 1, 2, 5, 7, 9, 0 };
        int findNumber = 7;
        boolean isExistingInArray = false;

        for (int number : myNumberArray) {
            if (number == findNumber) {
                isExistingInArray = true;
                break;
            }
        }

        if (isExistingInArray) {
            System.out.println("The desired number exist in the array.");
        } else {
            System.out.println("The desired number DOES NOT exist in the array.");
        }
    }
}
