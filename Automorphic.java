import java.util.Scanner;
public class Automorphic {
    public static void main(String args[]) {
        System.out.print("Enter a munber : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp,count=0,sqr;
        int n=num,t;
        while(num>0){
            num=num/10;
            count+=1;
        }
        sqr=n*n;
        temp=(int)(sqr%(Math.pow(10,count)));
        if(temp==n){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not an automorphic number");
        }
    }
}
