import java.io.*;
import java.util.Scanner;
public class Addition
{
    int x,y,z;
    int add(int x,int y)
    {
        z=x+y;
        return z;
    }
    public static void main(String agrs[])
    {
        int x,y,z;
        Addition a= new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an two integers for addition:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=a.add(x,y);
        System.out.println("Sum of"+x+"and"+y+"is"+z);
    }
}
