
public class EncapsulateParent {
	/*
	 * Encapsularea reprezinta procesul de code wrapping intr-un singur unit. Facem asta pentru a proteja
	 * clasa de exterior.
	 * Userul poate sa creeze o clasa fully encapsulated facand toate elementele din clasa aia private si sa foloseasca
	 * metode de setters and getters pentru a seta si prelua datele din clasa
	 * 
	 * Orice clasa care extinde clasa EncapsulateParent nu o sa poata accesa aceste variabile in mod direct
	 * 
	 */
	
	
	
	private String myName;
	private int myAge;
	private String myJob;
	
	//Metodele get sunt read -only cod.
	//Ca sa facem clasa sau variabila read-write, mai trebuie sa adaugam si ceva setters
	public String getName() {
		return myName;
	}
	public int getAge() {
		return myAge;
	}
	public String getJob() {
		return myJob;
	}
	
	
	
	public void setName(String myName) {
		this.myName = myName;
	}
	
	//Putem sa adaugam si restrictii cu ajutorul unui setter:
	public void setAge(int myAge) {
		if(myAge >= 18) {
			this.myAge = myAge;
		}else {
			System.out.println("Denied!");
		}
	}
	public void setJob(String myJob) {
		this.myJob = myJob;
	}
	
}
