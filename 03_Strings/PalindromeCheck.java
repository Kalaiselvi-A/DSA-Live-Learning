public class PalindromeCheck {

    public static void main(String[] args) {

        String str = "madam";

        int left = 0;                 // starting index
        int right = str.length() - 1; // ending index

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false; // mismatch found
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
