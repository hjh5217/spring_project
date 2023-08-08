package tal.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.HandPhone;
import tal.Bicycle;
import tal.Bucket;
import tal.Handle;
import tal.MTB;
import tal.Pocari;
import tal.ThreeBicycle;

public class Tal_main {

	public static void main(String[] args) {

		/*
		 * Handle yesHandle = new Handle(); Handle noHandle = new Handle();
		 * 
		 * Bucket yesBucket = new Bucket(); Bucket noBucket = new Bucket();
		 * 
		 * yesHandle.setHandleExist("핸들있음"); noHandle.setHandleExist("핸들없음");
		 * 
		 * yesBucket.setBucketExist("바구니 있음"); noBucket.setBucketExist("바구니 없음");
		 * 
		 * Bicycle three = new Bicycle(); three.setWheel(3); three.setHandle(yesHandle);
		 * three.setBucket(noBucket);
		 * 
		 * Bicycle pocari = new Bicycle(); pocari.setWheel(2);
		 * pocari.setHandle(yesHandle); pocari.setBucket(yesBucket);
		 * 
		 * Bicycle MTB = new Bicycle(); MTB.setWheel(2); MTB.setHandle(yesHandle);
		 * MTB.setBucket(noBucket);
		 * 
		 * System.out.println(three); System.out.println(pocari);
		 * System.out.println(MTB);
		 */

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/bicycle.xml");

		Bicycle threeCycle = (Bicycle) context.getBean("threeCycle");
		Bicycle pocari = (Bicycle) context.getBean("pocari");
		Bicycle MTB = (Bicycle) context.getBean("MTB");
		System.out.println("세발자전거 - " + threeCycle);
		System.out.println("포카리자전거 - " + pocari);
		System.out.println("MTB - " + MTB);
		System.out.println("---------------------------------------------------");
		ThreeBicycle tb = new ThreeBicycle(); 
		Pocari po = new Pocari(); 
		MTB mtbDoing = new MTB(); 
		System.out.println(tb); 
		System.out.println(po);
		System.out.println(mtbDoing);
		 
	}

}
