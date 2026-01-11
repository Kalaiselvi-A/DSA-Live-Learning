public class OnlyDigitsCheck {

    public static void main(String[] args) {

        String str = "12345";
        boolean isDigit = true;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character is not a digit
            if (ch < '0' || ch > '9') {
                isDigit = false;
                break;
            }
        }

        System.out.println("Contains only digits? " + isDigit);
    }
}
