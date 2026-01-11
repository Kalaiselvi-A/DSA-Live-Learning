public class CountCharacters {

    public static void main(String[] args) {

        // Input string
        String str = "Hello World";

        // Variable to store the count of characters
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {

            // charAt(i) returns the character at index i
            // We check if it is NOT a space
            if (str.charAt(i) != ' ') {
                count++;   // Increase count for every valid character
            }
        }

        // Print the final count
        System.out.println("Total Characters = " + count);
    }
}
