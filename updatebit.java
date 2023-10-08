import java.util.*;
public class updatebit {
    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the position you want to update: ");
        int pos=sc.nextInt();
        System.out.print("To clear enter 0 and To set enter 1: ");
        int choice=sc.nextInt();
        int bitmask=1<<pos;
        if(choice==0){
            int notbitmask=~(bitmask);
            int newnumber=notbitmask&n;
            System.out.print("After updation: "+newnumber);
        }
        else{
            int newnumber=bitmask|n;
            System.out.print("After updation: "+newnumber);
        }
    }
}
