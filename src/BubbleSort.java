//Bubble sort
public class BubbleSort
{

    public static void Bubble(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

                for(int data:arr)
                {
                    System.out.print(" "+data);
                }
    }


    public static void main(String[] args)
    {

        int[] arr={1,5,6,2,3,4};

        System.out.println("Before Swapping");

        for(int ele:arr){
            System.out.print(" "+ele);
        }


        System.out.println();


        System.out.println("after Swapping");

        Bubble(arr);




    }
}
