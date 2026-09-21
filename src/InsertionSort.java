public class InsertionSort {

    public static void Insertion(int[] arr) {
        int n = arr.length;

        //3,2,5,4,1
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;

        }

        for (int data : arr) {
            System.out.print(" "+data);
        }


    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 5, 1,2};

        Insertion(arr);

    }
}

