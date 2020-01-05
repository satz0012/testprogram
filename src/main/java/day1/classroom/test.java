package day1.classroom;

 class test1 {
	int a=10;
	int b=20;
	int sum=a+b;
	

	
}
class test2 extends test1
{
	int c=10;
	int sum2=a+b+c;

	
}	
	
class test
{
public static void main(String[] args)
{
	

test2 t2 =new test2();
System.out.println("The sum of a and b is " +t2.sum);
System.out.println("The sum of a,b and c is" +t2.sum2);
}
}

	
	


