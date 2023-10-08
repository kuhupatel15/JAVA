//Write a program to find if a number is a power of 2 or not.
import java.util.Scanner;

public class BitQ1 {
    public static void main(String args[]) {
        System.out.print("Enter a munber: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%10!=0){
            if((num&1)==0){
                System.out.print(num +" is a power of 2");
            }
            else{
                System.out.print(num+" is not a power of 2");
            }
        }
        else{
            System.out.print(num+" is not a power of 2");
        }
    }
}
