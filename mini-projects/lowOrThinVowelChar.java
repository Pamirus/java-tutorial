public class lowOrThinVowelChar {
    public static void main(String[] args) {
        char myChar = 'A';

        switch (myChar) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Given character is low vowel.");
                break;
            default:
                System.out.println("Given character is thin vowel.");
        }
    }
}
