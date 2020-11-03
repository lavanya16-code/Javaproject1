package task3;
import java.util.Random;

public class SavingsAccount extends Account{
	final double minbalance=1000;
	void withdraw(double d) {
		if(balance >=1000)
		{
			balance=balance-d;
			System.out.println("your current balance:"+balance);
		}
		else
		{
			System.out.println("your Account balance is insufficient");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new SavingsAccount ();
		Account c=new SavingsAccount ();
		Person m=new Person();
		Person n=new Person();
		Random o=new Random();
		obj.setAccNum((long)(o.nextInt(50000)+999999));
		obj.setBalance(2000);
		m.setName("smith");
		m.setAge(26);
		m.setAccHolder(obj);
		c.setAccNum((long)(o.nextInt(50000)+999999));
		c.setBalance(3000);
		n.setName("Kathy");
		n.setAge(28);
		n.setAccHolder(c);
		obj.deposit(2000);
		obj.balanceEnquiry();
		c.withdraw(2000);
	}
		
		

	}

