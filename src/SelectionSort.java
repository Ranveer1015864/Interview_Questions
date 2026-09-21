 public class SelectionSort
 {

    public static void Selection(int []arr)
    {
        int n = arr.length;
        for (int i = 0;i <n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n;j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

                if (min != i) {
                    int temp = arr[min];
                    arr[min] = arr[i];

                    arr[i] = temp;

                }

        }
        for(int data:arr){
            System.out.print(" "+data);
        }
    }
    public static void main(String[] args) {

        int[] arr={2,4,1,5,3};
        Selection(arr);

    }
}
