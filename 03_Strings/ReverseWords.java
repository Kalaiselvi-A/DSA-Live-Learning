public class ReverseWords {

    public static void main(String[] args) {

        String str = "Java is fun";
        String[] words = str.split(" ");
        String result = "";

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reversedWord = "";

            // Reverse the word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }

            result = result + reversedWord + " ";
        }

        System.out.println("Output: " + result.trim());
    }
}
