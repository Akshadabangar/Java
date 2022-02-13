package test1;
class stud
{
int length;
int width;
void insert(int l,int w)
{
length=l;
width=w;
}
void calculateArea()
{
	System.out.println(length*width);
	}
	}
	
public class TestRectangle1 
{
	
	public static void main(String args[])
	{
	stud r1=new stud();
	stud r2=new stud();
	r1.insert(11,5);
	r2.insert(3,15);
	r1.calculateArea();
	r2.calculateArea();
	}
	}
	

