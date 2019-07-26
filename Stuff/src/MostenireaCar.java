
public class MostenireaCar {
	//Daca setam ca aceasta clasa sa fie final, ea nuo sa mai poata sa fie mostenita!
	
	MostenireaCar(){
		System.out.println("Creating car");
	}
	
	/* Asta este clasa parinte
	 * 
	 * Mostenirea este un mecanism in care un obiect preia toate
	 * proprietatile si behavior-urile obiectului parinte.
	 * Mostenirea este foarte importanta in reusabilitate si Method Overriding 
	 * 
	 * 
	 */
	String name = "Car segment";
	int Wheels = 4;
	
	public void run() {
		System.out.println("The car is running");
	}
	public final void stop() {
		System.out.println("The car stopped");
	}
	//Metodele final nu pot sa fie overriden de catre clasele copil!
	
	
}
