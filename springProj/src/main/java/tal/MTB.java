package tal;

public class MTB implements Doing{

	@Override
	public void go() {
		System.out.println("MTB 간다");
		
	}

	@Override
	public void repair() {
		System.out.println("MTB 고쳐요");
		
	}

	@Override
	public void fall() {
		System.out.println("MTB 넘어져썽요");
		
	}

	@Override
	public String toString() {
		go();
		repair();
		fall();
		return "";
	}

}
