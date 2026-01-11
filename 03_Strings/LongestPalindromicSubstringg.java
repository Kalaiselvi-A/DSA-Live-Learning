public class LongestPalindromicSubstringg {

    public static void main(String[] args) {

        String str = "babad";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);

                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longest);
    }

    // Function to check if a string is palindrome
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
