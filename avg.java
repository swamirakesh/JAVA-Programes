import java.util.*;
public class avg{
    //avg function
    public static void avg(int A, int B, int C){
        System.out.print((A+B+C)/3);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A: ");
        int A=sc.nextInt();
        System.out.print("Enter B: ");
        int B=sc.nextInt();
        System.out.print("Enter C: ");
        int C=sc.nextInt();
        avg(A,B,C);

    }
}
