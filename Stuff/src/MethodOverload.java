
public class MethodOverload {
	// TODO Auto-generated method stub
			/*
			 * Method overloading-ul este polymorphism
			 * Daca o clasa are multiple metode cu acelasi nume dar cu 
			 * parametrii diferiti, este cunoscut ca si Method Overloading
			 * Method overloading creste readabilitatea programului
			 * 
			 * Pentru a atinge method overloading in java, trebuie sa:
			 * - Schimbam Numarul de argumente 
			 * - Schimbam tipu de data (data type)
			 */
	
	public void addValues(int a, int b) {
		int c = a +b;
		System.out.println(c);
	}
	
	public void addValues(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}
//Aici am atins method overloading-ul prin schimbarea numarului de parametrii
	
	public void addValues(double a, int b) {
		double c = a + b;
		System.out.println(c);
	}
	//^ Aici am atins method overloading prin schimbarea data type-ului
	public double addValues(double a, double b) {
		double c = a + b;
		return c;
	}
	
	//^ Aici am atins method overloading prin schimbarea data type-ului
	
	public static void main(String[] args) {
		MethodOverload add1 = new MethodOverload();
		add1.addValues(2, 3);
		add1.addValues(2, 3, 5);
		add1.addValues(2.4, 3);
		
		double d = add1.addValues(2.5, 3.5);
		System.out.println(d);
		
	}

}
