package InterfaceDemo;

public class OutWorker implements IWorkable {

	@Override
	public void work() {
		System.out.println("Dışarı İşçisine İş verildi...");
	}

}
