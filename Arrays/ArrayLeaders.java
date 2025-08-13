import java.util.*;

public class ArrayLeaders {
    public List<Integer> arrayLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        ArrayLeaders al = new ArrayLeaders();
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = al.arrayLeaders(arr);
        for (int i : leaders) {
            System.out.print(i + " ");
        }
    }
}
