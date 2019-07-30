
public class InterfataCopil implements Interfata{
/*
 * Pentru a implementa interfata trebuie sa creem o alta clasa si sa folosim
 * keyword-ul implements.
 * Acea clasa trebuie sa implementeze toate metodele din interfata. 
 * Toate clasele care implementeaza interfata trebuie sa implementeze metodele interfatei
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfata s5 = new InterfataCopil();
		s5.displayName();
		s5.getStudentNumber();
		s5.getStandard();
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Emil");
	}

	@Override
	public void getStudentNumber() {
		// TODO Auto-generated method stub
		System.out.println(3453);
	}

	@Override
	public void getStandard() {
		// TODO Auto-generated method stub
		System.out.println("BCDEE");
	}
	
	public void getUniversityName() {
		System.out.println(Interfata.Universitate);
	}

}
