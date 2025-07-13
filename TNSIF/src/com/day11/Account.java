package com.day11;

public class Account implements bank {
		private int accNo;
		private String Name;
		private double balance;
		
		

	@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + "]";
		}

	public Account() {
			super();
		}

	public Account(int accNo, String name, double balance) {
			super();
			this.accNo = accNo;
			Name = name;
			this.balance = balance;
		}

	public int getAccNo() {
			return accNo;
		}

		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

	@Override
	public void deposit(int amt) throws DepositLimitException {
		if(amt > 25000) {
			throw new DepositLimitException("Daily Limit Exception");
		}
		else {
			balance+=amt;
			System.out.println("Amount Dep[osited ..."+amt);
		}
		
	}

	@Override
	public synchronized void Withdraw(int amt) throws InsufficientBalanceException {
		if(balance - amt <MINbal) {
			throw new InsufficientBalanceException();
		}else {
			balance-=amt;
			System.out.println("After withdrawing Rs: "+amt+" current balance is Rs: "+balance);;
		}
		
	}
}
