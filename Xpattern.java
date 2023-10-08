import java.util.*;
public class Xpattern {
    public static void main(String args[]) 
    {
        System.out.println("ENTER NO. ROW : ");
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(); 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(i==j||(i+j)-m==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
     }
}
