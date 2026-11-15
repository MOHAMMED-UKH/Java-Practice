public class bobblesort {
    public static void main(String[] args) {
        int [] numbers={1,3,6,2,7};

        System.out.println("Array Before Sorting");
        displayArray(numbers);
        System.out.println("-------");
        bubbleSort(numbers);
        System.out.println("Array After Sorting");
        displayArray(numbers);
        
        System.out.println("-------");



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
        int temp=index1;
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
        
    }





    public static void displayArray(int[] numbers) {
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
}
