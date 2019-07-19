
public class CondStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "Test";
		String test2 = "Test2";
		
		int x = 2;
		int y = 1;
		String name = "Emil";
		
		//Concatenarea se face prin operatorul +
		System.out.println(test1 + test2);
		
		/*
		 * Operatorul + daca este aplicat asupra valorilor
		 * numerice (sau asupra variabilelor ce stocheaza valori numerice
		 * v-a actiona ca si aditie
		 */
		System.out.println(x + y);
		
		
		// Executarea programului se face de la stanga la dreapta.
		System.out.println(x+ y+ test1+ test2);  
		 
		
		/*
		 * Putem sa ne lovim de urmatoarea problema in cazul 
		 * in care se concateneaza si se realizeaza aditia in acelasi timp.
		 * Deoarece executarea se face de la stanga la dreapta,
		 * in cazul asta prim data string-urile se concateneaza dupa care are
		 * loc o noua concatenare asupra numerelor (totul o sa ia forma unui string).
		 * Astfel ca aditia nu o sa mai aiba loc
		 */
		System.out.println(test1 + test2 + x + y);
		
		
		if(x == y) {
			System.out.println("This is true");
		} else if(x < y) {
			System.out.println("2 is true");
		} else {
			System.out.println("else is true");
		}
		
		/*
		 * Switch statement-ul v-a executa un statement bazat pe conditii multiple.
		 * Case values trebuie sa fie doar sub forma de switch expression.
		 * Adica daca avem o valoare numerica atunci toate case values din interiorul
		 * switch statement-ului trebuie sa aiba valori numerice
		 * Case values trebuie sa fie unice!
		 * 
		 * Fiecare case statement poate sa aiba un break statement care este optional.
		 * Daca nu este specificat un break statement, atunci tot codul o sa fie rulat/printat
		 * chiar daca o conditie de acolo a fost executata. Este foarte indicat
		 * folosirea break la final de fiecare case.
		 * Valorile pot sa aiba si un default label care este optional
		 */
		switch(y) {
		case 1:
			System.out.println("Y equals to 1");
		break;
		
		case 2:
			System.out.println("Y equals to 2");
			break;
			
		default:
			System.out.println("Y is not available");
		}
		
		switch (name) {
		case "George":
			System.out.println("Access Denied");
			break;
			
		case "Emil":
			System.out.println("Access Granted");
			break;
			
		default:
			System.out.println("No name entered");
		}
		
		
	}

}










