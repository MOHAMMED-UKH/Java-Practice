public class Main {

public static void main(String[] args) {
    
    //double [] [] gpas = {{3.5, 2.7, 1.5} , {3.8, 2.3, 3.2}};


    double [][] gpas = new double[2][3];



}
public static void dsplayArray(double[][]arr){
//i need nested loops
System.out.println(arr.length);
for (int row = 0; row< arr.length; row++){


for (int col = 0; col< arr[0].length; col++)
{


    System.out.println("GPA: "+arr[row][col]);

    if (col < array[row].length - 1){
        System.out.println(" - ");
    }
}
        System.out.println();

}


}
    
}
