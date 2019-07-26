
 public interface  Interfata {
	/*
	 * Interfata este folosita pentru a atinge 100% abstractizare in Java. In interfata doar metodele abstracte sunt permise
	 * Toate variabilele declarate in interfata trebuie sa fie constante (final)
	 * Nu poti sa creezi obiectului unei interfate (nu poti sa o instantiezi) - ca si clasele abstracte
	 * O interfata este folosita folosind keyword-ul interface
	 * 
	 */

public static final String Universitate = "Babes Boylai";

public void displayName();
public void getStudentNumber();
public void getStandard();

//	Interfata o sa presupuna tot timpul ca fiecare metoda definita in interiorul interfatei este una abstracta 
//( de aceea nu mai e necesar sa folosim keyword-ul abstract)
}
