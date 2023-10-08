import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
    }
}
