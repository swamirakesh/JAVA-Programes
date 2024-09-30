//Title: Convert Text into ASCII value that means it encrypt your message into numbers
//Date: 30 Sep 2024
//Naming Convention: camelCase
//Courtesy: Rakesh Swami
import java.util.*;
public class encrypt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Message to Encrypt: ");
        String msg=sc.nextLine();
        for(int i=0;i<msg.length();i++)
        {
            int ASCIIValue=(int)msg.charAt(i);
            System.out.print(" "+ASCIIValue);
        }
    }
}
