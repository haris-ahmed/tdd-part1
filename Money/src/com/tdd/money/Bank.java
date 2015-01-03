package com.tdd.money;

public class Bank {

	Money reduced(Expression source, String to) {
		return source.reduce(to);
	}
}
