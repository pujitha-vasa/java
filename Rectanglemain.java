import java.io.*;
import java.util.Scanner;
 class Rectanglearea
{
    int l,b;
    int area(){
        return(l*b);
    }
}
class Main{
	public static void main(String args[]) 
	{
	    Rectanglearea ra=new Rectanglearea();
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth values:");
		ra.l=sc.nextInt();
		ra.b=sc.nextInt();
		System.out.println("Area of rectangle is"+ra.area());
	}
}
