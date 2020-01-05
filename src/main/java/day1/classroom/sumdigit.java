package day1.classroom;

public class sumdigit {




public static void main(String[] args) {
	int i=123;
	int sum=0;
	int rem;
	 while(i!=0) {
		   rem=i%10;
		   System.out.println("The reminder is: " +rem);
		   sum=sum+rem;
		   i=i/10;
		   System.out.println("The Quotient is: " +i);
	   }
	 System.out.println("The total sum is: " +sum);	
}
}