public class AnagramCheck {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Array to store character frequencies (ASCII)
        int[] count = new int[256];

        // Count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

        // Subtract characters of second string
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
        }

        // Check if all values are zero
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
