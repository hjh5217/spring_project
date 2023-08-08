package tal;

public class Handle {
	String name = "핸들";
	String handleExist;

	public Handle(){
		
	}

	@Override
	public String toString() {
		return handleExist;
	}

	public String getHandleExist() {
		return handleExist;
	}

	public void setHandleExist(String handleExist) {
		this.handleExist = handleExist;
	}
	
}
