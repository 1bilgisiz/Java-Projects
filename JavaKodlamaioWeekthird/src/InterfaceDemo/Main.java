package InterfaceDemo;

public class Main {

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.Eat();
		worker.Pay();
		worker.work();

		OutWorker outWorker = new OutWorker();
		outWorker.work();

		Robots robots = new Robots();
		robots.work();
	}

}
