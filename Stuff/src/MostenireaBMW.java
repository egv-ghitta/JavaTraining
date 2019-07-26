
public class MostenireaBMW extends MostenireaCar{
	MostenireaBMW(){
		super();
		System.out.println("Apelam Contstructorul BMW");
	}
	/*
	 * ! Cand creem un obiect al clasei copil, automat constructorul clasei
	 * parinte o sa fie invocat. Deci nu e neaparat de folosit fiindca constructorul
	 * este invocat automat! (vezi ce se intampla daca stergi super-ul din constructor
	 */
	
	static String name ="BMW";


public void getName() {
	System.out.println(name);
	System.out.println(super.name); // V-a accesa variabila instance a clasei parinte.
	
	/*
	 * Keyword-ul super este un refference variable folosit sa faca
	 * referire la obiectul clasei parinte.
	 * super poate sa faca referire la instance variable class ^
	 */
}

//public void stop() {
	///System.out.println("hah"); Nu putem sa ii face override fiindca aceasta metoda este definita ca final in clasa parinte
//}

public void run() {
	System.out.println("BMW is running");
	super.run();
	
	//Poate sa fie folosit super si pentru a invoca metoda din clasa parinte
}
	
	//O clasa poate sa extinda o alta clasa via keyword-ului extends
//Mostenirea este reprezentata de IS-A repationship in JAVA
//Aici clasa asta este clasa copil	

public static void main(String[] args) {
MostenireaCar bmw1 = new MostenireaCar();
MostenireaBMW bmw2 = new MostenireaBMW();

System.out.println(name);
System.out.println("It has " + bmw1.Wheels + " nr Of wheels");
bmw1.run();
bmw1.stop();
//Putem sa creem un obiect al clasei parinte in clasa copil si putem
//sa accesam metodele parintelui


bmw2.run();
bmw2.stop();
// Putem sa accesam metodele parintelui si printr-un obiect al clasei copil
bmw2.getName();
bmw2.run();

}
/*
 * Tipuri de mosteniri:
 * Single : B mosteneste pe A
 * Multi nivel: C mosteneste pe B care mosteneste pe A
 * ierarhic: B mosteneste pe A , C mosteneste si ea pe A
 * 
 * Multiple inheritance nu se poate in java! (C mosteneste atat pe A cati si pe B)
 */
}