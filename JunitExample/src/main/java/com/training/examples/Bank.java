package com.training.examples;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public double withdraw(double amount) throws ExceedingException,NegValueException{
		if(amount>4000) {
			throw new ExceedingException("amount beyond limit");                                
		}
		if(amount<=0) {
			throw new NegValueException("amount less than 0");
		}
		balance-=amount;
		return balance;
	}
	public double deposit(double amount) throws NegValueException {
		if(amount>4000) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<0) {
			throw new NegValueException("amount less than 0");
		}
		balance+=amount;
		return balance;
	}
    public double avg(double x,double y,double z) throws NegValueException{​​​​​​​
        if(x<0||y<0||z<0) 
        {​​​​​​​
            throw new NegValueException("negative numbers not allowed");​​​​​​​
        }
           // int sum=x+y+z;
            return (x+y+z)/3;
    
​​​​​​​

}
}
