public class ValidShuffle {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "def";
        String str3 = "adbcef";

        if (isValidShuffle(str1, str2, str3)) {
            System.out.println(str3 + " is a valid shuffle of " + str1 + " and " + str2);
        } else {
            System.out.println(str3 + " is NOT a valid shuffle");
        }
    }

    static boolean isValidShuffle(String s1, String s2, String s3) {

        int i = 0, j = 0, k = 0;

        while (k < s3.length()) {

            if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
                i++;
            } else if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        // Check if all characters of s1 and s2 were used
        return (i == s1.length() && j == s2.length());
    }
}
