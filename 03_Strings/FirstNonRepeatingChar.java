public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "swiss";
        int[] count = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
