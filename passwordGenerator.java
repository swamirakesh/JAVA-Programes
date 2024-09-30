//Title: Password generator
//Date: 1 Oct 2024
//Naming Convention: camelCase
import java.util.*;
public class passwordGenerator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        name=name.replace(" ","");
        int length=name.length();
        System.out.println(name+"@"+length);
    }
}
