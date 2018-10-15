public class First {

	int empno;
	String name;
	First()
	{
		
	}
	
	First(int empno,String name)
	{
	empno=this.empno;
	System.out.println("The emp num is"+empno);
	System.out.println("The emp name is"+name);
	
	}
}


public class Second  extends First{

int s1,s2,s3,total;
Second(int empno,String name,int s1,int s2,int s3)
{
	super(empno,name);
	this.s1=s1;this.s2=s2;this.s3=s3;
	total=s1+s2+s3;
	System.out.println("the total marks"+total);
}
public static void main(String[] args)
{
	Second s=new Second(101,"Srikanth",70,90,80);
First s6=new Second(102,"madhu",78,89,89);


}

}
