public class TwoSUm {

    public static void twosum(int[] arr, int target){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("ARRAY index "+i + " and " + j);
                    System.out.println(arr[i] + " + " + arr[j]+" = "+target);
                }
            }
        }

    }
    public static void main(String[] args) {

        int[] arr={2,3,4,6,8,5};
        int target=10;

        twosum(arr,target);

    }
}
