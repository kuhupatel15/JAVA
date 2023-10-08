import java.util.*;
public class Vpattern {
    public static void main(String args[]) 
    {
        System.out.println("ENTER NO. STARS : ");
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(); 
        int n=m*2-1;
        int a=64;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m*2-1;j++){
                if(i==j||j==n){
                    System.out.print((char)(a+j));
                }
                else{
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println();
        } 
    }
}
