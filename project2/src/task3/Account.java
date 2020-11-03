package task3;
import java.util.Random;
public class Account {
	long accNum;
	double balance;
	Account accHolder;
	public long getAccNum(){
		return accNum;
	}
	public void setAccNum(long accNum){
		this.accNum=accNum;
	}
	public double getBalance(){
	      return balance;
		
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	void deposit(double b) {
		balance=balance+b;
	}
	void withdraw(double b) {
		balance=balance-b;
	}

	
	void balanceEnquiry() {
		System.out.println("your account balance:"+balance);
		}
	}


