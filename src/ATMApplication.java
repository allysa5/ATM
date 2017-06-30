import java.util.Scanner;
public class ATMApplication {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int option=0;
		ATM a = new ATM();
		Account c = new Account();

		System.out.println("Please enter your pin number");
		int pin = keyboard.nextInt();
		keyboard.nextLine();
		if (c.checkpin(pin)){
			System.out.println("What type of transaction would you like to make");
			System.out.println(" 1.Deposit\n 2.Withdrawal\n 3.Check Balance\n 4.Quit\n ");
			option = keyboard.nextInt();
			keyboard.nextLine();
			if (option == 1){
				System.out.println("Please enter the amount you would like to deposit");
				double money =keyboard.nextDouble();
				keyboard.nextLine();
				c.makedeposit(money);
				System.out.printf("The balance is %f\n",c.checkbalance());
				System.out.println("Thanks for using ATM. Have a nice day!");

			}else if (option == 2){
				System.out.println("Please enter the amount you would like to withdraw");
				double money =keyboard.nextDouble();
				keyboard.nextLine();
				c.makewithdrawal(money);
				System.out.printf("The balance is %f\n",c.checkbalance());
				System.out.println("Thanks for using ATM. Have a nice day!");

			}else if (option == 3){
				System.out.printf("The balance is %f\n",c.checkbalance());
				System.out.println("Thanks for using ATM. Have a nice day!");

			}else{
				System.out.println("Thanks for using ATM. Have a nice day!");
			}
			/*a.makedeposit();
		a.makewithdrawal();
		a.checkbalance();
		a.transfer();
		System.out.printf("The balance is %f\n",c.checkbalance());

		c.getName();
		c.getPin();
		c.getAcctnum();
		c.checkbalance();


		money = 50.0;
		c.makewithdrawal(money);
		System.out.printf("The balance is %f\n",c.checkbalance());
			 */
		}
	}

}
