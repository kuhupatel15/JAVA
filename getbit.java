import java.util.Scanner;

public class getbit {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position you want to check: ");
        int pos=sc.nextInt();
    
        int bitmask=1<<pos;
        if((bitmask & n )==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
