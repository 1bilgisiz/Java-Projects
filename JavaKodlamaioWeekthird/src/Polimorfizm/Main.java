package Polimorfizm;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] baseLoggers= new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new ConsoleLogger()};
//
//		for (BaseLogger baseLogger : baseLoggers) {
//			baseLogger.log("Loglandı...");
//		}
//	
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();

	}

}
