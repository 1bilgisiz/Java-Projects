package InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//TarimKrediManager tarimKrediManager= new  TarimKrediManager();
		//tarimKrediManager.Hesapla();

		
		KrediUI krediUI= new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
