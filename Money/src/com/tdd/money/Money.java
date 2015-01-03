package com.tdd.money;

public class Money {

	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency.equals(money.currency());
	}
	
	protected String currency() {
		return currency;
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}
