public class AnagramCheckTwo {

    public static void main(String[] args) {

        String s1 = "race";
        String s2 = "care";

        // If lengths are different, they are not anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[256]; // ASCII size

        // Count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

        // Subtract characters of second string
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
