public class strings {
    public static void main(String[] args) {
        String myString = "The weather is warm.";
        System.out.println("Total number of characters: " + myString.length());        
        System.out.println("The 5th character is: " + myString.charAt(4));        
        System.out.println("Display the concat: " + myString.concat(" I will take a swim."));
        System.out.println("Check if the sentence starts with 'T': " + myString.startsWith("T"));
        System.out.println("Check if the sentence ends with '.': " + myString.endsWith("."));

        System.out.println("----o----");
        
        char[] myChars = new char[5];
        myString.getChars(0, 5, myChars, 0);
        System.out.println("Characters: ");
        System.out.println(myChars);
        
        System.out.println("----o----");
        
        System.out.println("The index of the character 'a' is: " + myString.indexOf('a'));
        System.out.println("The index of the characters 'ath' is: " + myString.indexOf("ath"));
        System.out.println("The last index of the character 'a' is: " + myString.lastIndexOf('a'));
        
        System.out.println("----o----");
        
        String myString2 = myString.replace(' ', '-');
        System.out.println("Remove the spaces: " + myString2);
        
        System.out.println("----o----");
        
        System.out.println("Remove the four characters from the beginning: " + myString.substring(4));
        System.out.println("Extract the characters between the 15th and 19th index: " + myString.substring(15, 19));
        
        System.out.println("----o----");
        
        System.out.println("Split the sentence from the space characters: ");
        for (String word : myString.split(" ")) {
            System.out.println(word);
        }
        
        System.out.println("----o----");
        
        System.out.println("Convert the text to upper case: " + myString.toUpperCase());
        System.out.println("Convert the text to lower case: " + myString.toLowerCase());
        
        System.out.println("----o----");
        
        String myString3 = "    This string contains empty space at the beginning and ending.   ";
        System.out.println("|" + myString3 + "|");
        System.out.println("Trimmed string: " + myString3.trim());
    }
}
