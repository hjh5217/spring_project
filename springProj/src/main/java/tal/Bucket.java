package tal;

public class Bucket {
	String name = "바구니";
	String bucketExist;	
	
	public Bucket(){
		
	}

	@Override
	public String toString() {
		return bucketExist;
	}

	public String getBucketExist() {
		return bucketExist;
	}

	public void setBucketExist(String bucketExist) {
		this.bucketExist = bucketExist;
	}
	
}
