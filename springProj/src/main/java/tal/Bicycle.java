package tal;

import java.util.Arrays;

public class Bicycle {
	
	Wheel [] wheel;
	Handle handle;
	Bucket bucket;
	String space=", ";
	
	public Bicycle(){
		
	}

	@Override
	public String toString() {
		if(bucket.getBucketExist()=="") {
			space = "";
		}
		return wheel.length +"개" + ", " + handle + space + bucket ;
	}

	public Wheel[] getWheel() {
		return wheel;
	}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}

	public Handle getHandle() {
		return handle;
	}
	public void setHandle(Handle handle) {
		
		this.handle = handle;
	}
	public Bucket getBucket() {
		return bucket;
	}
	public void setBucket(Bucket bucket) {
		
		this.bucket = bucket;
	}
	
}
