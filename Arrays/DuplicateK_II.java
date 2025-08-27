import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateK_II {
    public static ArrayList<Integer> duplicateK(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == k) {
                // Insert an adjacent k
                arr.add(i + 1, k);
                i++;

                // Remove the last element
                arr.remove(arr.size() - 1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 0, 4, 5, 0));
        int k = 0;
        ArrayList<Integer> ans = duplicateK(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}