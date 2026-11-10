import java.util.Scanner;

public class insertatbeg {
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
        for (int i = validSize-1; i>=0; i--) {
            ages[i+1]=ages[i];
            //is 5>=0
            //is 4>=0
            //is 3>=0
            //is 2>=0
            //is 1>=0
            //is 0>=0
            
        }
        ages[0]=element;
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