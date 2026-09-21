public class SortPractice {

    public static void sort(int[] arr) {
        int n=arr.length;

      for(int i=0;i<n-1;i++){
          int min=i;
          for(int j =i+1;j<n;j++){
              if(arr[min]>arr[j]){
                  min=j;
              }
          }
          if(min!=i){
              int temp=arr[min];
              arr[min]=arr[i];
              arr[i]=temp;
          }
      }
      for(int x:arr){
          System.out.print(x+" ");
      }

    }


    public static void main(String[] args) {

        int []arr={4,2,3,5,1};
                sort(arr);
    }
}
