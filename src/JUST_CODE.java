// Find the largest element in an integer array.
class ArrLargest {
    public void ARRAY() {
        int[] arr = {20, 30, 40, 50,};

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest number in array:"+largest);

    }
}

//Find the second-largest element in an array.
class ArrSecLargest {

    public void SECarr(){
        int[] arr={1,2,3,4,5,66,45};
    int largest = arr[0];
    int secondLargest = arr[0];

for (int i = 1; i < arr.length; i++) {

        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        }
        else if (arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }

System.out.println("Largest: " + largest);
System.out.println("Second Largest number is Array: " + secondLargest);
    }
}

// Smallest element in array
class ArrSmallest {
    public void ARRAY() {
        int[] arr = {20, 30, 40, 50,};

        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number in array:"+smallest);

    }
}
//Find the sum of all elements in an array.
class SUM{
    public void ArrSUM() {
        int[] arr = {10, 20, 30, 40,};

      int sum=0;
        for (int i = 0; i < arr.length; i++) {

                 sum=sum+arr[i];

        }
        System.out.println("Sum of Array"+sum);



    }
}

// Find the sum and average of all elements in an array.
class AVG{
    public void ArrAvg() {
        int[] arr = {10, 20, 30, 40,};

        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];

        }
        double avg=(double)sum/arr.length;

        System.out.println("Average of given Array: "+avg);



    }
}

//Count the number of even and odd elements.
class EVOD {
    public void EVENODD() {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("sum of Even numbers: " + even);
        System.out.println("sum of Odd numbers: " + odd);
    }
}

//Reverse an array without using another array.
class ReverseArray{
    public void Reverse() {
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}

//Search for a given element using linear search.

class Search{
    public void LinearSearch(){
        int[] arr={1,2,3,4,5};
        int key=5;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element found at index:"+i+" "+"key="+key);
                return;
            }

        }


    }
}

//Count how many times a particular number occurs in an array.
class CountElement{
    public void TimesOccur(){
        int[] arr={1,2,3,4,5,6,2,9,2};
        int target=2;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(target+" occured "+count+" times");
    }
}

// Merge two integer arrays into a single array.
class MergeArray{
    public void merging(){
        int[] arr1={10,20,30};
        int[] arr2={40,50,60};

        int[] arr3=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++) {
            arr3[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        for(int i:arr3){

            System.out.print("  "+i);
        }
    }
}


public class JUST_CODE {
    public static void main(String[] args) {
        ArrLargest arrL=new ArrLargest();
        arrL.ARRAY();

        System.out.println("------------------------------------------------------------------------------");

        ArrSecLargest arrSL=new ArrSecLargest();
        arrSL.SECarr();

        System.out.println("------------------------------------------------------------------------------");

        ArrSmallest arrS=new ArrSmallest();
        arrS.ARRAY();

        System.out.println("------------------------------------------------------------------------------");

        SUM Asum=new SUM();
        Asum.ArrSUM();

        System.out.println("------------------------------------------------------------------------------");

        AVG aravg=new AVG();
        aravg.ArrAvg();

        System.out.println("------------------------------------------------------------------------------");

        EVOD evod=new EVOD();
        evod.EVENODD();

        System.out.println("------------------------------------------------------------------------------");

        ReverseArray rev=new ReverseArray();
        rev.Reverse();
        System.out.println();

        System.out.println("------------------------------------------------------------------------------");

        Search ls=new Search();
        ls.LinearSearch();


        System.out.println("------------------------------------------------------------------------------");


        CountElement freq=new CountElement();
        freq.TimesOccur();

        System.out.println("------------------------------------------------------------------------------");


        MergeArray merge=new MergeArray();
        merge.merging();



    }
    }

