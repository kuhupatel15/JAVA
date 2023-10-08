import java.util.Scanner;

public class Panildrome{
    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int n= num,p=n,temp,count=0,sum=0,t;
        while(num>0){
            temp=num%10;
            num=num/10;
            count++;
        }
        int c=count-1;
        while(c>=0){
            t=n%10;
            sum=sum+t*((int)Math.pow(10, c));
            n=n/10;
            c--;
        }
        if(p==sum){
            System.out.println("Panildrome");
        }
        else{
            System.out.println("Not a panildrome");
        }

        
    }
}