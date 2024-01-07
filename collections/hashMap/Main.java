import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionaryMap = new HashMap<String, String>();
        dictionaryMap.put("Table", "der Tisch");
        dictionaryMap.put("Door", "die Tur");
        dictionaryMap.put("Book", "das Buch");
        dictionaryMap.put("Car", "das Auto");
        
        System.out.println(dictionaryMap);
        
        System.out.println("----o----");
        // ---
        
        dictionaryMap.remove("Book");
        System.out.println("Get Book after removal: " + dictionaryMap.get("Book"));
        
        System.out.println("----o----");
        // ---

        for (String words : dictionaryMap.keySet()) {
            System.out.println("English: " + words + " German: " + dictionaryMap.get(words));
        }

        System.out.println("----o----");
        // ---
        
        dictionaryMap.clear();
        System.out.println(dictionaryMap.size());
    }
}
