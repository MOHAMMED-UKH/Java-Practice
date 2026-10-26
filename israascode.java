import java.util.Scanner;
public class israascode {
    


    public static void main(String[] args) {
        
        
        char[] letters = new char[4];
        displayArray(letters); 
        
        fillArray(letters);
        System.out.println("-----------------");
        changeLetter(letters); 
        displayArray(letters);

    }

    public static void displayArray(char[] ltrs)
    {
        //the action to take is to print each memory location in the array
        for(int count = 0; count<= ltrs.length-1; count++)
        {
            System.out.println("Char "+(count+1)+": "+ltrs[count]);
        }
    }

    public static void fillArray(char[] charArr){
        Scanner input = new Scanner(System.in);
        // the action to take is to add a new character to each slot in the array
        for(int count = 0; count< charArr.length; count++){
            System.out.print("Enter a character: ");
            charArr[count] = input.next().charAt(0);
        }
    }

    public static void changeLetter(char[] letter)
{
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an index (0-3): ");
    int index = sc.nextInt();

    letter[index] = 'a';
}


    
}//end of class


