public class PangramCheck {

    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] letters = new boolean[26];

        // Traverse each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                letters[ch - 'A'] = true;
            } else if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;

        // Check if all letters are present
        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is NOT a pangram");
        }
    }
}
