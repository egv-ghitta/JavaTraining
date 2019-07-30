
public class MethodOverridingCopil extends MethodOverridingParinte{
	public int getInterest() {
		return 7;
	}
	
	
	
	/*
	 * Method Overriding este polymorphism
	 * 
	 * Daca o clasa copil are aceeasi metoda ca si cea declarata
	 * in clasa parinte se numeste method overriding.
	 * 
	 * Method overriding este folosit pentru a implementa in mod specific
	 * o metoda care este deja data (sau provided) de catre superclass (clasa parinte)
	 * 
	 * Method overriding este cunoscut si ca RunTimpe Polymorphism.
	 * (La runtime Java isi da seama ce metoda sa execute cu ajutorul obiectului)
	 * 
	 *-Metoda trebuie sa aiba acelasi nume ca si in clasa parinte
	 *-Metoda trebuie sa aiba aceeasi parametrii (sau aceeasi semnatura) ca si clasa parinte. 
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingCopil copil1 = new MethodOverridingCopil();
		System.out.println(copil1.getInterest());
		
		MethodOverridingCopil2 copil2 = new MethodOverridingCopil2();
		System.out.println(copil2.getInterest());
	
		
		//Metodele au fost suprascrise iar Java stie ce metode sa execute la runtime datorita obiectelor
	}

}
