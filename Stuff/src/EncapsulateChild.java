
public class EncapsulateChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulateParent en = new EncapsulateParent();
		en.setName("Emil");
		en.setAge(18);
		en.setJob("QA");
		
		System.out.println(en.getName());
		System.out.println(en.getAge());
		System.out.println(en.getJob());
	}

}
