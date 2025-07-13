package com.day11;

public interface bank {
	static final int MINbal =5000;
	static final int DAILY_LIMIT = 25000;
	
	void deposit (int amt) throws DepositLimitException;
	void Withdraw  (int amt) throws InsufficientBalanceException;


}
