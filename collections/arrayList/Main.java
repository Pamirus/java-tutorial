import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // myArray();
        ArrayList integers = new ArrayList<Integer>();
        System.out.println("integers.size() at initialization: " + integers.size());
        
        System.out.println("----o----");
        // ---
        integers.add(7);
        integers.add(9);
        System.out.println("integers.size(): " + integers.size());
        
        System.out.println("integers.get(0): " + integers.get(0));
        
        System.out.println("----o----");
        // ---
        
        integers.set(0, 5);
        System.out.println("integers.get(0) after changing the first element: " + integers.get(0));
        
        integers.remove(0);
        System.out.println("integers.get(0): " + integers.get(0));
        
        System.out.println("----o----");
        // ---
        
        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (Object i : integers) {
            System.out.println("integers: " + i);
        }
        
        System.out.println("----o----");
        // ---
        
        integers.clear();
        System.out.println("integers.size() after clearing the arrayList: " + integers.size());
    }
    
    public static void myArray() {
        int[] integers1 = new int[] { 1, 2, 3 };
        integers1 = new int[4];
        integers1[3] = 4;
    
        // Prints 0 instead of 1; 4th line causes "integers" array to be erased.
        System.out.println("integers1[0]: " + integers1[0]); 
    }
}