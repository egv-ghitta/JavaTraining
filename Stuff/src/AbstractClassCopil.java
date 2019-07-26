
public class AbstractClassCopil extends AbstractClass {
	//Trebuie neaparat sa implementam metodele existente in clasa abstracta si sa le facem ovveride	
		@Override
		public void displayShape() {
			// TODO Auto-generated method stub
			System.out.println("Cub");
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass s1 = new AbstractClassCopil();
		s1.displayShape();
		
		//Nu putem sa instantiem clasa abstracta
		//de ce? fiindca metodele claselor abstracte nu au implementatii si nu se vad
		//si nu vad de ce sa se creeze obiecte ale clasei respective
	}


}
