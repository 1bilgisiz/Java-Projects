package Interfaceler;

public class CustomerManager {

	ICustomerDal customerDal;
	public void Ekle() {
		customerDal.Ekle();
	}
}
