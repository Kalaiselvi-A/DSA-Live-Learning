public class PalindromeIgnoreCase {

    public static void main(String[] args) {

        String str = "Madam";
        str = str.toLowerCase();  // Convert to lowercase

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
