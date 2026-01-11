public class CountCharacterFrequency {

    public static void main(String[] args) {

        String str = "program";
        int[] count = new int[256]; // ASCII array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Print characters with frequency > 0
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " : " + count[i]);
            }
        }
    }
}
