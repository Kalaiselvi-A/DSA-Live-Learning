public class CountDigitsSpecial {

    public static void main(String[] args) {

        String str = "Hello123!@#";
        int digits = 0;
        int special = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;  // Count digits
            } else if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                special++; // Count special characters
            }
        }

        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}
