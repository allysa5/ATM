
public class Account implements iATM{
	private String name;
	private int pin;
	private int acctnum;
	public double balance;
	private boolean input;
	public Account (){
		this.name = "tom";
		this.pin = 1234;
		this.acctnum = 7525;
		this.balance = 2000.0;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;

	}
	public int getAcctnum() {
		return acctnum;

	}
	public void setAcctnum(int acctnum) {
		this.acctnum = acctnum;
	}
	@Override
	public double checkbalance() {
		return balance;

	}
	@Override
	public boolean makedeposit(double amt) {
		balance += amt;
		return true;
		
	}
	@Override
	public boolean makewithdrawal(double amt) {
		if (balance<amt){
			return false;
		}else{
			balance -= amt;
			return true;
		}
	}
	
	
	@Override
	public boolean checkpin(int pin) {
		if(this.getPin()== pin){
			return true;
		}else{
			return false;
		}

	}



}
