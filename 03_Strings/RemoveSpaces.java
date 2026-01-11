public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "Hello World";
        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Add to result if not space
            if (ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println("String without spaces: " + result);
    }
}
