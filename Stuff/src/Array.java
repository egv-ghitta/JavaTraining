
public class Array {

	public static void findMin(int arrayOne[]) {
		int min = arrayOne[0];
		
		for(int i = 1; i <arrayOne.length;i++) {
			if(min > arrayOne[i]) { // Pentru a afla valoarea maxima inlocuim > cu <
				min = arrayOne[i];
			}
		}
		System.out.println("Minimum value is : " + min);
	}
	
	/*
	 * ^Cum functioneaza?
	 */

	
	/*
 * Array-ul este o colectie de date similare. 
 * Cand avem de stocat o multitudine de elemente asemanatoare, putem sa folosim un array.
 * 
 * In JAVA un array este index based, primul element dintr-un array este stocat pe pozitia 0 (sau are index 0)
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Exista mai multe tipuri de array:
		 * 1 Diminesional
		 */
		int a[] = new int[12]; //Declararea array-ului
		//Prima data trebuie definit tipul de date care o sa le contina array-ul. Arrayul de mai sus o sa contina integers
		a[0] = 5; //Initializarea array-ului. Spatiul de pe index-ul 0 o sa fie ocupat de valoarea 5
		System.out.println(a[0]);//printam valoarea de pe index-ul respectiv
		
		//Un array se poate definii si asa:
		int myArray[] = {45,32,23,56}; // Declarare + initializare
		
		//Pentru a itera prin tot array-ul, putem sa folosim un for loop
		
		for(int i = 0; i <myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		
		//Putem sa trimitem un array unei metode: si sa aflam valoarea minima
		findMin(myArray);
		
	}

}
