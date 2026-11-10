import java.util.Scanner;

public class insertatend {
    static Scanner input = new Scanner(System.in);
    static int validSize = 5;

    public static void main(String[] args) {
        int[] ages = new int[10];
        

        

        
        populateArray(ages);
        System.out.print("Enter the element you want to add: ");
        int element = input.nextInt();
        insertAtBeg(ages,element);
        displayArray(ages);

        
}
    public static void insertAtBeg(int [] ages,int element){
        if (validSize==ages.length) {
            System.out.println("Array is Full! ");
            return;
        }
        
        ages[validSize]=element;
        validSize++; //increase taken spaces
}   public static void populateArray(int[] ages) {
    for (int i = 0; i < validSize; i++) {
        System.out.print("Enter Value " + (i+1) + ": ");
        ages[i]=input.nextInt();
    }
}


    public static void displayArray(int [] ages) {
        for (int i = 0; i < validSize; i++) {
            System.out.println("Value " + (i+1) + ":" + ages[i]);
        }
    }




}
