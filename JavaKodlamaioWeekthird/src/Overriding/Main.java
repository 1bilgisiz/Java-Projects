package Overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
				{new TarimKrediManager(), new OgretmenKrediManager(),  new OgrenciKrediManager()};
		
				for (BaseKrediManager baseKrediManager : baseKrediManagers) {
					System.out.println(baseKrediManager.Hesapla(1000)  );
				}
		

	}

}
