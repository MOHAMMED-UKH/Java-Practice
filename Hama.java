import java.util.Scanner;
public class Hama{
    public static void main(String [] args){
        
        
        
        char [] letters = new char[4];
        
        FillArray(letters);
        MyLetters(letters);
        ChangeLetter(letters[2]);

    } 
    public static void MyLetters (char[] letters){
        
        for (int i = 0; i <letters.length; i++) {
            System.out.println("Char " + (i+1) + ": " + letters[i] );
            
        }
    }
    public static void FillArray(char [] charArr){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Chars: ");
        for (int i = 0; i < charArr.length; i++) {
            charArr[i]=sc.next().charAt(0);
        }
        
    }
    public static void ChangeLetter(char letter) {
        letter = 'a';
        

    }
}

    

    







