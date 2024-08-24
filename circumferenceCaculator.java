import java.util.*;
public class circumferenceCaculator {
    //circumference function
    public static double circumference(double radius){
        //float pi=3.14;
        double circum=3.14*2*radius;
        return circum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius=sc.nextFloat();
        double circum=circumference(radius);
        System.out.print(circum);
    }
}
