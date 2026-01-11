public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Java is fun";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {

            String reversedWord = "";

            // Reverse individual word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            result += reversedWord + " ";
        }

        System.out.println("Reversed words: " + result.trim());
    }
}
