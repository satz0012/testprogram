package week3.classroom;

public class mypay
{
	public static void main(String[] args) {
		Learninterface pay=new cardpayment("10/21",4386011,811);// object for class with interface
		Learninterface pay1=new netbankingpayment();
		pay.payment(1000);
		pay1.payment(1000);
		
		
	}
}
