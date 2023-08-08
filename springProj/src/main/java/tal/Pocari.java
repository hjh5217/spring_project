package tal;

public class Pocari implements Doing{

	@Override
	public void go() {
		System.out.println("포카리 간다");
		
	}

	@Override
	public void repair() {
		System.out.println("포카리 고쳐요");
		
	}

	@Override
	public void fall() {
		System.out.println("포카리 넘어져요");
		
	}

	@Override
	public String toString() {
		go();
		repair();
		fall();
		return "";
	}
}
