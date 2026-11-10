import java.util.Scanner;
public class binaryAlg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ages={19,21,25,30,35}; //sorted ASC
        System.out.print("Enter A Value To Search For: ");
        int sv=sc.nextInt();
        int result=SearchArr(ages,sv);
        if (result!=-1) {
            System.out.println(sv +" Found At Index: " + result);
        } else{
            System.out.println("Value Was Not Found!");
        }

}
    public static int SearchArr(int[]ages,int sv) {
        int low,mid,high;
        low=0;
        high=ages.length-1;
        while (low<=high) {
            mid=(low+high)/2;
            if (sv==ages[mid]) {
                return mid;
            }else if (sv>ages[mid])
                {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } //end of while
        return -1;
    }
}
    
