import java.util.Scanner;

public class searcharr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] array = {'s', 'a', 'b', 'w'};
        int ArraySize = array.length - 1;
        int index;
        // use result to check if the user's index is valid
        boolean result;
        // loop will run while its true
        // user needs to press -1 to quit 
        while (true) {
            System.out.print("Enter an index between (0:3) or -1 to quit: ");
            index = sc.nextInt();

            if (index == -1) {
                System.out.println("Goodbye!");
                break;
            }

            
            result = checkIndex(index, ArraySize);

            if (result == true) {
                System.out.println("element found at: " + index + " is: " + array[index]);
            } else {
                System.out.println("Wrong choice, Re-Enter an array index between (0:3): ");
            }
        }

       
    }

    public static boolean checkIndex(int index, int ArraySize) {
        if (index >= 0 && index <= ArraySize) {
            return true;
        } else {
            return false;
        }
    }
}