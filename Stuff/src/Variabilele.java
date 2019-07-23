
public class Variabilele {
int i = 0;
static int x = 0;
	
	Variabilele(){
		i++;
		x++;
		System.out.println(i);
		System.out.println(x);
	}
	//^ Variabilele statice pot sa fie folosite ca sa faca referire la property-uri comune ale obiectelor
	//i deoarece apaartine obiectului tot timpul o sa fie 1 
	//x deoarece apartine clasei o sa se incrementeze de fiecare data cand se apaleaza constructorul
	
	
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
	String firstName ="Emil";
	/*
	 * Static este folosit mai mult pentru managementul memoriei. Putem 
	 * sa creem metode statice,variabile statice precum si code blocks care sunt statice
	 * Membrii statici ai clasei apartin clasei respective mai degraba decat a obiectului clasei.
	 * 
	 * Constructorul nu poate sa fie static deoarece acesta este invocat la crearea obiectului
	 * iar membrii statici ai clasei apartin clasei nu a obiectului clasei (intra in contradictie).
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there");
		firstMethod();
		System.out.println(lastName);
		//System.out.println(firstName);
		//^ Nu putem sa il chemam asa fiindca nu apartine clasei, ca sa fie invocat trebuie creat un obiect.
		//Apartine obiectului si nu a clasei!
		
		//static - apartine clasei 
		//non-static - apartinne obiectului clasei
		
		Variabilele va = new Variabilele();
		System.out.println(va.firstName);
		Variabilele va2 = new Variabilele();
		
		
	}
	
	public static void firstMethod() {
		//Metoda statica apartine clasei si nu a obiectului. Ea poate sa fie invocata fara a fi nevoie sa creem
		//o instanta noua a clasei (obiect)
		
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
