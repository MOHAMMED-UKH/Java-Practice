import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers={1,3,6,2,7};

        System.out.println("Array Before Sorting");
        displayArray(numbers);
        System.out.println("-------");
        bubbleSort(numbers);
        System.out.println("Array After Sorting");
        displayArray(numbers);
        
        System.out.println("-------");
        System.out.println("BinarySearch");
        System.out.print("Enter A Number To Search For: ");
        int search=sc.nextInt();
        int result = binarySearch(numbers,search);
        if (result!=-1) {
            System.out.println(search + " Found At Index: " + result);
        } else{
         System.out.println(search +" Was NOT found!");
        }


    }
    public static void displayArray(int[] numbers) {
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
    
    
    
    
    

    public static void bubbleSort(int [] numbers) {

        for (int outerloop = 0; outerloop <numbers.length-1; outerloop++) {
            for (int innerloop = 0; innerloop <numbers.length-1-outerloop; innerloop++) {
                if (numbers[innerloop]>numbers[innerloop+1]) {
                    swap(numbers,innerloop,innerloop+1);
                }
            }


        }
        
    }
    public static void swap(int [] numbers,int index1,int index2) {
        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
        
    }


    public static int binarySearch(int[]numbers,int search) {
        int low=0;
        int high=numbers.length-1;
        

        while (low<=high) {
            int mid=(low+high)/2;

            if (search==numbers[mid]) {
                return mid;
            }
            else if (search>numbers[mid]) {
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return -1;


    }







    
}
