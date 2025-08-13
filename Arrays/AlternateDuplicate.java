public class AlternateDuplicate {
    public void alternateDuplicate(int[] arr, int k) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        
        for (int left = 0; left <= length_ - possibleDups; left++) {
            if (arr[left] == k) {
                if (left == length_ - possibleDups) {
                    arr[length_] = k; 
                    length_--;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length_ - possibleDups;

        
        for (int i = last; i >= 0; i--) {
            if (arr[i] == k) {
                arr[i + possibleDups] = k;
                possibleDups--;
                arr[i + possibleDups] = k; 
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        AlternateDuplicate ad = new AlternateDuplicate();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        ad.alternateDuplicate(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
