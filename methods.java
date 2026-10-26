import java.util.Scanner;
public class methods{
public static void main(String[] args) {
    
    int [] nums = new int[5];
    FillMarks(nums);

    ShowMarks(nums);

    int result = CountPass(nums);

    System.out.println("Number of students who passed: " + result);
}
public static void FillMarks(int [] nums){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <5; i++) {
        System.out.print("Enter mark " + (i+1) + " :");
        nums[i]=sc.nextInt();
    }

}
public static void ShowMarks(int [] nums) {
    for (int i = 0; i <nums.length ; i++) {
        System.out.println("All marks: " + nums[i]);
    }
}
public static int CountPass(int [] nums) {
    int count=0;
    for (int i = 0; i <nums.length; i++) {
        if (nums[i]>=50) {
            count++;
        }
        
    } return count;
}


}