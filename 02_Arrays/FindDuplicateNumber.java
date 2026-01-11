import java.util.HashSet;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        // Approach 1: HashSet
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;

        for (int num : arr) {
            if (set.contains(num)) {
                duplicate = num;
                break;
            }
            set.add(num);
        }

        System.out.println("Duplicate Number (HashSet): " + duplicate);

        // Approach 2: Floyd's Tortoise and Hare
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println("Duplicate Number (Floyd's method): " + slow);
    }
}
