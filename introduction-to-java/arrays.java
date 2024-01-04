public class arrays {
    public static void main(String[] args) {
        int[] myIntegerSet = new int[3];
        myIntegerSet[0] = 0;
        myIntegerSet[1] = 1;
        myIntegerSet[2] = 2;

        for (int i = 0; i < myIntegerSet.length; i++) {
            System.out.println(myIntegerSet[i]);
        }

        System.out.println("----o----");
        
        for (int myInteger:myIntegerSet) {
            System.out.println(myInteger);
        }
    }
}
