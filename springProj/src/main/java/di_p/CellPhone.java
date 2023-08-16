package di_p;

import java.util.List;

public class CellPhone {

	String name;
	Battery battery;
	Display display;
	List<CP_Camera> camera;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	public List<CP_Camera> getCamera() {
		return camera;
	}
	public void setCamera(List<CP_Camera> camera) {
		this.camera = camera;
	}
	@Override
	public String toString() {
		return "기기명 : " + name + ", " + battery + ", " + display + ", " + camera;
	}

}

class Battery {
	String name;
	int capacity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "배터리명 : " + name + ", 용량 : " + capacity +"mA";
	}
}

class Display{
	String name;
	int pixel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "액정명 : " + name + ", 화질 : " + pixel ;
	}
}

class CP_Camera{
	String name;
	int pixel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "카메라명 : " + name + ", 화소 : " + pixel;
	}
	
}