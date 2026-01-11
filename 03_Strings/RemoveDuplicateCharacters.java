public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "programming";

        boolean[] visited = new boolean[256]; // ASCII characters
        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If character is not visited, add it
            if (!visited[ch]) {
                result = result + ch;
                visited[ch] = true; // mark as visited
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
