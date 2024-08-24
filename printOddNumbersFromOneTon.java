import java.sql.SQLOutput;
import java.util.*;
public class printOddNumbersFromOneTon {
    //function
    public static void printOddNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0 || i==2){
                sum=sum+i;
            }
        }
        System.out.println("Sum is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N Value: ");;
        int n=sc.nextInt();
        printOddNumber(n);
    }
}
