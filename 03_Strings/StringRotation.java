public class StringRotation {

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("Not Rotation");
            return;
        }

        // Concatenate str1 with itself
        String concat = str1 + str1;

        // Check if str2 is substring of concatenated string
        if (concat.contains(str2)) {
            System.out.println(str2 + " is rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT rotation of " + str1);
        }
    }
}
