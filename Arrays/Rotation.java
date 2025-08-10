public class Rotation {
    public void rotate(int[] arr, int d){
           int n = arr.length;
           d = d%n;
           int[] temp = new int[n];
           for(int i = 0; i<n-d; i++){
            temp[i] = arr[d+i];
           }
           for(int i = 0;i<d;i++){
            temp[n-d+i] = arr[i];
           }
           for(int i = 0;i<n;i++){
            arr[i] = temp[i];
           }
    //     int k = d%arr.length;
    //     while(k>0){
    //      int temp = arr[0];
    //      for(int i=1;i<arr.length;i++){
    //          arr[i-1] = arr[i];
    //      }
    //      arr[arr.length-1] = temp;
    //      k--;
    //    }
    }
    public static void main(String[]args){
        Rotation rt = new Rotation();
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rt.rotate(arr, d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
