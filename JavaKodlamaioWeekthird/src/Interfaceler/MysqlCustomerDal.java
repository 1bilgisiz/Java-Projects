package Interfaceler;

public class MysqlCustomerDal implements ICustomerDal, IRepostory {

	@Override
	public void Ekle() {

		System.out.println("Mysql Eklendi...");
	}

}
