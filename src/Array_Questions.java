
//1. Find the largest element in an integer array.
class Largest{
    int[] arr={1,2,2,3,3,4,4,5};
    int largest=arr[0];
    public void largestnumber(){
    for(int i=0;i<arr.length;i++) {
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
        System.out.println("Largest element :"+largest);
    }
}

//2. Find the second-largest element in an array.
class Secondlargest{
    int[] arr={1,2,2,3,3,4,4,5};
    int largest=arr[0];
    int secLarge=arr[0];
    public void SecondL() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLarge = largest;
                largest = arr[i];
            } else if (arr[i] > secLarge) {
                secLarge = arr[i];
            }
        }
        System.out.println("Seconf largest element :"+secLarge);
    }

}
//3. Find the smallest element in an array.
class Smallest{
    int[]arr={1,2,3,4,5,6};
    int smallest=arr[0];
    public void small(){
    for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
        }
    }
        System.out.println("Smallest element :"+smallest);
    }
}

//4. Find the sum and average of all elements in an array.
class SumAvg{
    int[] arr={1,2,3,4,5};
    int sum=0;

    public void Avgsum(){
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of arr :"+sum);

        double avg=(double) sum/arr.length;
        System.out.println("Average of arr"+avg);
    }
}

//5. Count the number of even and odd elements.
class EvenOdd{
    int[] arr={1,2,3,4,5};
    int even=0;
    int odd=0;

    public void evod(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even numbers occured "+even+" times");
        System.out.println("Odd numbers occured "+odd+" times");
    }
}

//6. Reverse an array without using another array.
class RevArray{
    int[] arr={1,2,3,4,5};
    int left=0;
    int right=arr.length-1;

    public void Rever() {
        while (left < right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        for(int i:arr){
            System.out.print(" "+i);
        }
    }
}

//7. Search for a given element using linear search.
class Search{
    int[] arr={1,2,3,4,5};
    int target=5;

    public void find() {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(target+" found at index "+i);
            }
        }

    }
}

//8. Count how many times a particular number occurs in an array.
class Freq{
    int[]arr={1,2,3,4,5,5,6,5};
    int target=5;
    int count=0;

    public void displayfreq(){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
        }
    }
        System.out.println(target+" occured "+count+" times");
    }
}

//9. Merge two integer arrays into a single array.
class merge{
    int[] arr1={1,2,3,4,5};
    int[] arr2={6,7,8,9,10};

    int[] arr3=new int[arr1.length+arr2.length];
    public void ArrMerg() {
        for (int i = 0; i < arr1.length; i++){
            arr3[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }

        for(int i: arr3){
            System.out.print(" "+i);
        }
    }
}


public class Array_Questions {
    public static void main(String[] args) {

        Largest large=new Largest();
        large.largestnumber();

        System.out.println("---------------------------------------------------------------------------------");

        Secondlargest sl=new Secondlargest();
        sl.SecondL();

        System.out.println("---------------------------------------------------------------------------------");

        Smallest sm=new Smallest();
        sm.small();

        System.out.println("---------------------------------------------------------------------------------");

        SumAvg sa=new SumAvg();
        sa.Avgsum();

        System.out.println("---------------------------------------------------------------------------------");

        EvenOdd ev=new EvenOdd();
        ev.evod();

        System.out.println("---------------------------------------------------------------------------------");

        RevArray rv=new RevArray();
        rv.Rever();
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------");

        Search ss=new Search();
        ss.find();

        System.out.println("---------------------------------------------------------------------------------");

        Freq fq=new Freq();
        fq.displayfreq();

        System.out.println("---------------------------------------------------------------------------------");

        merge mg=new merge();
        mg.ArrMerg();
    }
}
