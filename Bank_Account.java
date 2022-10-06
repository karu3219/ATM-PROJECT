import java.util.Scanner;
class Bank
{
	private Long account_number;
	public double balance;
	private String Custumer_name,email_id;
	private long phone_no;
	public double ammount=0;
	public Long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(Long acc_no,int pin_code) 
	{
		if(acc_no!=84319478 || pin_code!=4512)
		{
			System.out.println("invalid Account number or pincode ");
				System.out.println("thank you");
		}
		account_number = acc_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustumer_name() {
		return Custumer_name;
	}
	public void setCustumer_name(String custumer_name) {
		Custumer_name = custumer_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public void deposite()
	{
		Scanner dep=new Scanner(System.in);
		System.out.print("enter the ammount to deposite:");
		int am=dep.nextInt();
		ammount=ammount+am;
		balance=ammount;
		System.out.println("your ammount is deposited successfully ");
		System.out.println("the total balence is "+ammount);
		dep.close();
	}
	public void withdrowl()
	{
		Scanner drow = new Scanner(System.in);
		System.out.print("enter the ammount to withdrowal :");
		int amt =drow.nextInt();
		if(amt<=0 || amt > ammount)
		{
			System.out.println("sorry,you entered ammount is out of your balence");
		}
		else
		{
		ammount=ammount-amt;
		balance=ammount;
		System.out.println("your withdrowal is done done successfully");
		System.out.println("your balence ammount is :"+ammount);
		drow.close();
		}
	}
	public void exit()
	{
		System.out.print("thank you");
	}
}
public class Bank_Account 
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome");
		System.out.print("enter your name:");
		String name = sc.nextLine();
		b.setCustumer_name(name);
		System.out.print("enter your email id:");
		String mail=sc.nextLine();
		b.setEmail_id(mail);
		System.out.print("enter your phone number:");
		long ph_no=sc.nextLong();
		try {
		b.setPhone_no(ph_no);
		}
		catch(Exception e)
		{
			System.out.println("enter only digits(10 digits)");
		}
		System.out.print("pleace enter  your Account number :");
		Long acc_no=sc.nextLong();
		System.out.print("enter the pincode:");
		int pin_code=sc.nextInt();
		b.setAccount_number(acc_no,pin_code);
		int choice=0;
		if(acc_no==84319478 && pin_code==4512)
		{
			do
			{
				System.out.println("enter your choice:1<-deposite,2<-withdrowl,3<-balance,4<-account number,5<-email id,6<-exit");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:b.deposite();
					break;
				case 2:b.withdrowl();
					break;
				case 3:System.out.println("the current balance ammount is:"+b.getBalance()+"Rs");
					break;
				case 4:System.out.println("your account number is:"+b.getAccount_number());
					break;
				case 5:System.out.println("your email id is:"+b.getEmail_id());
					break;
				case 6:b.exit();
					break;
				default:System.out.println("invalid choice");
				}
			}while(choice<=5);
		}
		sc.close();
	}
}
