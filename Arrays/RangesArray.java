public class RangesArray {
    public static int[][] missingRanges(int[] arr, int lower, int upper) {
        int[][] temp = new int[arr.length + 1][2];
        int count = 0;

        if (lower < arr[0]) {
            temp[count][0] = lower;
            temp[count][1] = arr[0] - 1;
            count++;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                temp[count][0] = arr[i] + 1;
                temp[count][1] = arr[i + 1] - 1;
                count++;
            }
        }

        if (upper > arr[arr.length - 1]) {
            temp[count][0] = arr[arr.length - 1] + 1;
            temp[count][1] = upper;
            count++;
        }

        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }
        return result;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        int[][] res = missingRanges(arr, lower, upper);
        for (int[] range : res) {
            System.out.println(range[0] + " " + range[1]);
        }
    }
}
