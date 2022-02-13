package test1;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String args[])
	{
	int count,num1=0,num2=1;
	System.out.println("How many numbers do you want fibonacci series:");
	Scanner sc=new Scanner(System.in);
	count=sc.nextInt();
	sc.close();
	System.out.println("Fibonacci series of\t"+count+"\tnumber");
	int i=1;
	while(i<=count)
	{
	System.out.println(num1+"");
	int prevtwosum=num1+num2;
	num1=num2;
	num2=prevtwosum;
	i++;
	}
	}
	}
	
