import java.util.*;
class printName{
    //sum return function
    public static int sum(int A, int B){
        //int sum=A+B;
        return (A+B);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A: ");
        int A=sc.nextInt();
        System.out.print("Enter B: ");
        int B=sc.nextInt();
        int sum=sum(A,B);
        System.out.print(sum);
    }
}