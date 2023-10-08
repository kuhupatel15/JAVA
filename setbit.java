//to make bit one
import java.util.Scanner;
public class setbit {
    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the position you want to set: ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int newnumber=bitmask|n;
        System.out.println("Newnumber"+ newnumber);
    }
}
