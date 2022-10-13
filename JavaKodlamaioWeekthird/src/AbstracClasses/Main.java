package AbstracClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator womenGameCalculator= new WomenGameCalculator();
		womenGameCalculator.Hesapla();
		womenGameCalculator.GameOver();
		
		GameCalculator calculator= new WomenGameCalculator();
		calculator.Hesapla();

	}

}
