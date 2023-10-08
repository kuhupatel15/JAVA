
import java.util.*;
import java.lang.Math;

public class Quadratic_eq {
    public static void main(String args[]) {
        System.out.println("Enter the coefficients a , b and c :");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x,y ;
        double d;
        d = b*b - (4*a*c);
        if (d==0){
            System.out.print("Equal roots :");
            x=-b/(2.0*a);
            System.out.println(x);
        }
        else if(d<0.0){
            System.out.println("No real roots");
        }
        else{
            x=(-b+Math.sqrt(d))/(2.0*a);
            y=(-b-Math.sqrt(d))/(2.0*a);
            System.out.print("Distinct roots :");
            System.out.print(x);
            System.out.print(" , ");
            System.out.println(y);
        }

    }
    
}
