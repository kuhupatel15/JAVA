import java.util.Scanner;
public class clearbit {
    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("");
        System.out.print("Enter the position you want to clear: ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);
        int newnumber=notbitmask&n;
        System.out.println("Newnumber"+ newnumber);
    
    }
}
