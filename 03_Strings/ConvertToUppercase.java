public class ConvertToUppercase {

    public static void main(String[] args) {

        String str = "Hello World";
        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If character is lowercase, convert it to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII conversion
            }

            // Add character to result string
            result = result + ch;
        }

        System.out.println("Uppercase String = " + result);
    }
}
