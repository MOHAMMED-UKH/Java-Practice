public class Hama{
    public static void main(String [] args){
        CheckAge(18);
        CheckAge(1);
    }

    static void CheckAge(int age){

        if (age>=18) {
            System.out.println("You Can Sign Up! ");
        } else{
            System.out.println("You Can't Sign Up! ");
        }
    }





}