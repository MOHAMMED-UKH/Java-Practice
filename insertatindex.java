
import java.util.Scanner;

public class insertatindex {
    static int validSize=3;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int [] arrayVal=new int[5];
        
         

        int element ,index;
        //let user fill the array
        populateArray(arrayVal);
        System.out.print("Enter Element To Add: ");
        element = sc.nextInt();
        System.out.print("Which Index: ");
        index = sc.nextInt();
        insertAtIndex(arrayVal, element, index);
        displayArray(arrayVal);

    }

    public static void  insertAtIndex(int [] arrayVal,int element,int index) {
        if (validSize==arrayVal.length) {
            System.out.println("Array is Full!");
            return;
        }
        if (index<0 || index>=validSize) {
            System.out.println("insertation Failed");
        }
        else{
            
            for (int i = validSize-1; i >=index; i--) {
                arrayVal[i+1]=arrayVal[i];
            }
            arrayVal[index]=element;
            validSize++;
        }
    }
    //user wants 10 at index 2
    //{1,2,3,4,5}
    //validSize is 3
    //index 0 Taken
    //index 1 Taken
    //index 2 Taken
    //then valid size will be +1 ~ 4
    //index 3 will be taken
    //0 1 2 3 
    public static void populateArray(int [] arrayVal){
        for (int i = 0; i <validSize ; i++) {
            System.out.print("Enter Value " + (i+1) + " : " );
            arrayVal[i]=sc.nextInt();
        }
    }


    public static void displayArray(int[]arrayVal){
        for (int i = 0; i < validSize; i++) {
            System.out.println("Value " + (i+1) + " : " + arrayVal[i]);
        }
    }


    
}
