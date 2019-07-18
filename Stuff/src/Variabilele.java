
public class Variabilele {
	/*
	 * Aceasta este variabila clasei sau instance variabile
	 * Sunt create in interiorul clasei si in exteriorul metodelor.
	 * Variabile clasei pot sa fie accesate oriunde in interiorul 
	 * clasei respective.
	 * 
	 * Variabilele statice nu pot sa fie locale
	 * Ele pot sa fie accesate doare prin intermediul metodelor statice
	 * 
	 * Variabilele statice apartin clasei. Poti sa folosesti variabilele 
	 * fara sa fie nevoie sa instantiezi clasa.
	 */
	static String lastName = "Ghitta";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there");
		firstMethod();
		
		
	}
	
	public static void firstMethod() {
		/*
		Aceste variabile au un scope limitat metodei in care au fost
		declarate si initializate.
		*/
		int age = 24; 
		String name = "Emil";
		System.out.println(age);
		System.out.println(name);
	}

}
