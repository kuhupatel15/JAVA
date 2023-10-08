import java.util.Scanner;
public class Greatest {
    public static void main(String args[]) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num!=num2 && num2!=num3 && num3!=num){
            if (num>num2 && num>num3){
                System.out.print(num);
                System.out.println(" is greatest");
            }
            else if(num2>num && num2>num3){
                System.out.print(num2);
                System.out.println(" is greatest");
            }
            else{
                System.out.print(num3);
                System.out.println(" is greatest");
            }
        }
        else{
            System.out.println("You have entered duplicate numbers");
        }
    }
}
