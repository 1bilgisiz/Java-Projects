package InterfaceDemo;

public class Worker implements IWorkable, IPayable, IEatable {

	@Override
	public void Eat() {
		System.out.println("Çalışana Yemek verildi...");

	}

	@Override
	public void Pay() {
		System.out.println("Çalışana Maaş verildi...");

	}

	@Override
	public void work() {
		System.out.println("Çalışana İş verildi...");
	}

}
