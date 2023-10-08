import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {
        System.out.print("Enter temperature in farenhiet :");
        Scanner sc = new Scanner(System.in);
        int temp=sc.nextInt();
        float c;
        c=((temp-32)*5)/9;
        System.out.print("Temperature in celsius :");
        System.out.println(c);
        
        
    }
    
}
