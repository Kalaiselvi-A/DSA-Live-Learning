public class CountVowels {

    public static void main(String[] args) {

        String str = "Education";
        int count = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                count++;
            }
        }

        System.out.println("Number of vowels = " + count);
    }
}
