
public class Constructorii {
	
	int age;
	String name;
	
/*
 * Constructorul este un block de cod , similar unei metode.
 * Este invocat cand o instanta a unui obiect este creata.
 * 
 * Regulile de creare a constructorului:
 * 1. Numele constructorului trebuie sa fie acelasi cu numele clasei
 * 2. Trebuie sa nu aiba un return type explicit
 * 3. Nu poate sa fie abstract, static sau final
 * 
 */
	//Exista mai multe tipuri de constructori:
	
	/*
	 * Constructorul Default
	 * De fiecare data cand un obiect este creat folosind keyword-ul new,
	 * macar 1 constructor este invocat. Acest constructor invocat 
	 * este default constructorul (cand nu exista parametrii specificati la crearea obiectului)
	 * 
	 */
	
	public Constructorii() {
		System.out.println("I'm the constructor");
	//^Acest cod o sa se execute la crearea instantei clasei
	}
	
	/*
	 * Exemplul de mai sus ne arata default constructorul in actiune. Chiar daca constructorul nu a fost
	 * definit si nu are code block, acesta tot v-a executa pe fundal la instantierea
	 * clasei obiect.
	 */
	
	//Constructorul Parametizat
	
	/*
	 * Un constructor este numit ca si default constructor atunco cand nu
	 * are nici-un parametru. Un constructor care are un numar specific de parametrii
	 * este numit constructor parametrizat
	 *
	 *Constructorii parametrizati sunt folositi pentru a atribuii diferitre
	 *valori la obiecte diferite. Dare se pot atribuii si aceleasi valor la mai multe obiecte
	 *
	 */
	
	public Constructorii(int age, String name) {
		this.age = age;
		this.name = name;
		
		/*
		 * In JAVA, this este un reference variable care face referirie la obiectul curent
		 * 
		 *Poate sa fie folosit ca sa faca referire la class instance variable
		 *Folosirea lui duce la evitarea confuziei aduse compilatorului atunci cand 
		 *atribuim numele parametriilor sa fie  acelasi cu numele variabilelor clasei 
		 */
		
	}
	
	/*
	 * Am folosit 2 Constructori care sunt diferiti in sensul in care unul este
	 * parametrizat si celalalt nu. Asta se numeste METHOD OVERLOADING iar in cazul de fata 
	 * am facut un CONSTRUCTOR OVERLOADING.
	 * 
	 * Putem sa tot creem constructori (n constructori) sa facem OVERLOADING. Dar la invocarea 
	 * constructorului x, trebuie sa ii dam exact numarul de parametrii ceruti de constructorul x
	 * pentru a-l invoca.
	 * ex: Constructorul x accepta 2 parametrii iar constructorul y accepta 3 parametrii. 
	 * Daca la invocare scriem Test dog1 = new Test(5,"Rex",25) atunci noi invocam constructorul y
	 * (deoarece specificam 3 parametrii la invocare).
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorii cons1  = new Constructorii();
		System.out.println(cons1.age);
		System.out.println(cons1.name);
		
		Constructorii cons2 = new Constructorii(26,"Emil");
		System.out.println(cons2.age);
		System.out.println(cons2.name);
		
	}

}
