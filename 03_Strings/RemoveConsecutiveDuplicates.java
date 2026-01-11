public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {

        String str = "aaabbbccdaa";
        String result = "";

        // Initialize previous character as empty
        char prev = '\0';

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // Append only if current char != previous char
            if (curr != prev) {
                result += curr;
            }

            prev = curr;
        }

        System.out.println("String after removing consecutive duplicates: " + result);
    }
}
