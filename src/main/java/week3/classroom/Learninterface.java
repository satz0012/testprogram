package week3.classroom;

public interface Learninterface {
     public void payment(int num);
}


class cardpayment implements Learninterface
{
	private String expdate;
	private int cardnum;
	private int cvv;
	public void payment(int num)
	{
		System.out.println("The cardnumber is: "+cardnum + "Expdate is: " +expdate + "CVV is: " +cvv);
	}
	cardpayment(String expdate,int cardnum,int cvv)
	{
		this.expdate=expdate;//The reason for creating the constructor means the variables declared are private and cannot be used in another class.So we are creating constructor and using as instance variable in main method by using object
		this.cardnum=cardnum;
		this.cvv=cvv;
	}
	}


class netbankingpayment implements Learninterface
{
	
	public void payment(int num)
	{
		System.out.println("payment is successfull for amount:"+num);
	}
	
}

