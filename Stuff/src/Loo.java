
public class Loo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Loop-urile sun folosite pentru executarea unui set de instructiuni/functii
		 * in mod repetat pana cand o anumita conidtie o sa fie evaluata cu true.
		 * Cand conditia devine false,loop-ul nu o sa mai fie executat.
		 */
		
		//For Loop-ul
		/*
		 * For loop-ul este cel mai des folosit intr-un program Java.
		 * Este folosit pentru a itera o parte din program de mai multe ori daca numarul de iteratii este unul fix.
		 Putem sa intializam variabila, sa verificam conditia si sa incrementam/decrementam valoarea.
		 */
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
		
		//Do while
		
		/*
		 * Condul din do v-a rula 1 data inainte de rularea/verificarea conditiei.
		 * Spre deosebire de celalte, coddul o sa ruleze macar1 data (chiar daca conditia evaluata este false).
		 * 
		 */
		
		int l = 0;
		do {
			System.out.println("Boing");
			l++;
		}while(l < 10);
		
		
		//While loop
		
		/*
		 * Variabilele date conditiei while loop-ului vor fi declarate si initializate in afara loop-ului
		 */
		
		int bnx = 0;
		while(bnx < 10) {
			System.out.println(bnx);
			bnx++;
		}
	}
	
	

}
