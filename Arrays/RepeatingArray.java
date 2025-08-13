public class RepeatingArray {
    public int[] repeatingArray(int[] arr) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] < 0) {
                result[0] = val; 
            } else {
                arr[val - 1] = -arr[val - 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RepeatingArray ra = new RepeatingArray();
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] result = ra.repeatingArray(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
