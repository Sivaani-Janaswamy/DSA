import java.util.ArrayList;

public class AlternateNegatives {
    public void alternateNegatives(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();


        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int k = 0, pi = 0, ni = 0;

    
        while (pi < pos.size() && ni < neg.size()) {
            arr[k++] = pos.get(pi++);
            arr[k++] = neg.get(ni++);
        }

        
        while (pi < pos.size()) {
            arr[k++] = pos.get(pi++);
        }


        while (ni < neg.size()) {
            arr[k++] = neg.get(ni++);
        }
    }

    public static void main(String[] args) {
        AlternateNegatives an = new AlternateNegatives();
        int arr1[] = {1, 2, 3, -4, -1, 4};
        int arr2[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        an.alternateNegatives(arr1);
        for (int i : arr1) System.out.print(i + " ");
        System.out.println();

        an.alternateNegatives(arr2);
        for (int i : arr2) System.out.print(i + " ");
    }
}
