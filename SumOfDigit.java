package test1;
import java.util.Scanner;
public class SumOfDigit 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int sum=0,rem;
	System.out.println("enter any number:");
	int no=sc.nextInt();
	while(no>0)
	{
	rem=no%10;
	sum=sum+rem;
	no=no/10;
	}
	System.out.println("sum is the"+sum);
	}
	}
	

