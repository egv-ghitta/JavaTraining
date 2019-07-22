
public class Obiect {
	//Definim state-urile
	String name = "Rex";
	String breed = "Bulldog";
	int height = 4; 
	String color = "Brown";
	
	//Definim Behavior-ul
	public void barking() {
		System.out.println(name + " is " + "barking");
		
	}
	public void eating() {
		System.out.println(name + "is " + "eating");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cu ajutorul keyword-ului new initializam clasa si creem obiectul clasei respective
		//Obiect reprezinta numele clasei 
		//dog1 reprezinta numele obiectului (mai este numit si reference variable sau variabila referinta).
		
		Obiect dog1 = new Obiect();
		System.out.println(dog1.name);
		dog1.barking();
		dog1.eating();
		
		
		//O sa fie acelasi nume doerece acceseaza aceeasi variabila a clasei
		Obiect dog2 = new Obiect();
		System.out.println(dog2.name);
		dog2.eating();
		dog2.barking();
		
		/*
		 * Tot ce am scris in interiorul clasei (state si behaviors) o sa fie wrapped up in obiectul creat (dog1 si dog2)
		 * Pentru accesarea tuturor proprietatilor clasei obiectului respectiv, se foloseste . 
		 * Optiunile care sunt displayed odata cu . le primim de la Clasa obiect (Object Class) care este clasa parinte a tuturor claselor din java.
		 */
		
	}

}
