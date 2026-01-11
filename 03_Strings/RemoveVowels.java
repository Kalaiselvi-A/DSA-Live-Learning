public class RemoveVowels {

    public static void main(String[] args) {

        String str = "Hello World";
        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If not a vowel, add to result
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {

                result = result + ch;
            }
        }

        System.out.println("String after removing vowels: " + result);
    }
}
