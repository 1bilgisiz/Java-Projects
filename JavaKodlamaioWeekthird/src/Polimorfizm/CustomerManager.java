package Polimorfizm;

public class CustomerManager {

	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;

	}

	public void Add() {
		System.out.println("Müşteri Eklendi...");
		this.baseLogger.log("log mesajııı");
	}
}
