public class MissingArray {

    public static void missing(  int[] arr ) {

        int n = arr.length;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,6,7};
        missing(arr);
    }
}