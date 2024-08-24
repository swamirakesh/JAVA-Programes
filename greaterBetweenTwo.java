import java.util.*;
public class greaterBetweenTwo
{
    //find greater value function
    public static int findGreater(int a,int b)
    {
        if (a >=0 && b >=0)
        {
            if (a >=b)
            {
                return a;
            } else
            {
                return b;
            }
        }
        else
        {
            System.out.print("Please enter Positive Number");
            return -1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num1: ");;
        int a=sc.nextInt();
        System.out.print("Enter Num2: ");
        int b=sc.nextInt();
        int greater=findGreater(a,b);
        if(greater>=0){
            System.out.print("Greter Value is: "+greater);
        }
    }
}
