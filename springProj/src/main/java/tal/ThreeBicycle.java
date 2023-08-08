package tal;

public class ThreeBicycle implements Doing{

	@Override
	public void go() {
		System.out.println("삼발이 간다");
		
	}

	@Override
	public void repair() {
		System.out.println("삼발이 고쳐용");
		
	}

	@Override
	public void fall() {
		System.out.println("삼발이 넘어졌어용");
		
	}

	@Override
	public String toString() {
		go();
		repair();
		fall();
		return "";
	}
}
