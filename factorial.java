//Factorial JAVA code
import java.util.*;
public class factorial {
    //factorial function
    public static void factorial(int num)
    {
        if(num==1 || num==0)
        {
            System.out.print(1);
        }
        else if(num<0){
            System.out.print("Input in Negative Value, please enter Positive number");
        }
        else {
            int total=1;
            for(int i=1;i<=num;i++)
            {
                total=total*i;
            }
            System.out.print(total);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        factorial(num);

    }
}
