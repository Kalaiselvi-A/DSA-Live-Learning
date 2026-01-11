public class CountConsonants {

    public static void main(String[] args) {

        String str = "Hello";
        int count = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character is an alphabet
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                // Check if it is NOT a vowel
                if (!(ch == 'a' || ch == 'e' || ch == 'i' ||
                      ch == 'o' || ch == 'u' ||
                      ch == 'A' || ch == 'E' || ch == 'I' ||
                      ch == 'O' || ch == 'U')) {

                    count++;
                }
            }
        }

        System.out.println("Number of consonants = " + count);
    }
}
