public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        // Input string
        String s = "babad";

        // This variable will store the final longest palindrome
        String longest = "";

        // Loop through every character in the string
        for (int i = 0; i < s.length(); i++) {

            // -------- ODD length palindrome --------
            // Treat s[i] as the center
            String odd = expandAroundCenter(s, i, i);

            // -------- EVEN length palindrome --------
            // Treat space between s[i] and s[i+1] as center
            String even = expandAroundCenter(s, i, i + 1);

            // Choose the longer palindrome
            if (odd.length() > longest.length()) {
                longest = odd;
            }
            if (even.length() > longest.length()) {
                longest = even;
            }
        }

        // Print the result
        System.out.println("Longest Palindromic Substring = " + longest);
    }

    // This function expands left and right to find palindrome
    static String expandAroundCenter(String s, int left, int right) {

        // Expand as long as left and right are within bounds
        // and characters are equal
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;   // move left pointer
            right++;  // move right pointer
        }

        // substring is taken after stopping expansion
        return s.substring(left + 1, right);
    }
}
