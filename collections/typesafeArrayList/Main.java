import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Dublin");
        cities.add("New York");
        cities.add("Paris");
        
        cities.remove("New York");
        cities.add("London");
        Collections.sort(cities);

        for (String city : cities) {
            System.out.println(city);
        }

    }
}
