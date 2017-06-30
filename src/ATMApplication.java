import java.util.Scanner;
public class ATMApplication {

	public static void main(String[] args) {
		System.out.println("Please enter your pin number");
		System.out.println("What type of transaction would you like to make");
		System.out.println(" 1.Deposit\n 2.Withdrawal\n 3.Check Balance\n 4.Quit\n ");
		
		ATM a = new ATM();
		a.makedeposit();
		a.makewithdrawal();
		a.checkbalance();
		a.transfer();
		Account c = new Account();
		System.out.printf("The balance is %f\n",c.checkbalance());

		c.getName();
		c.getPin();
		c.getAcctnum();
		c.checkbalance();

		double money = 100.0;
		c.makedeposit(money);
		System.out.printf("The balance is %f\n",c.checkbalance());
		
		money = 50.0;
		c.makewithdrawal(money);
		System.out.printf("The balance is %f\n",c.checkbalance());

		}

}
