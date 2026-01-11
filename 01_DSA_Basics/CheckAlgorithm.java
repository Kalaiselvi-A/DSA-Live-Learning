public class CheckAlgorithm {

    public static void main(String[] args) {

        // These values simulate the properties of a process
        boolean hasInput = true;       // Does it take input?
        boolean hasOutput = true;      // Does it produce output?
        boolean isFinite = true;       // Does it end?
        boolean isUnambiguous = true;  // Are the steps clear?

        /*
         A valid algorithm must satisfy all four conditions.
         We use logical AND (&&) to ensure all are true.
        */
        if (hasInput && hasOutput && isFinite && isUnambiguous) {
            System.out.println("YES");   // It is an algorithm
        } else {
            System.out.println("NO");    // It is not an algorithm
        }
    }
}
