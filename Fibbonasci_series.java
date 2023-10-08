import java.util.Scanner;

public class Fibbonasci_series {
    public static void main(String args[]) {
        System.out.println("Enter no. of terms : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("0 "+", 1 ");
        int prev=0,curr=1;
        int term=0;
        for(int i=0;i<num-2;i++){
            term=prev+curr;
            prev=curr;
            curr=term;
            System.out.print(" , "+term);
        }
        
    }
    
}
