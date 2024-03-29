package di_p.main;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/student.xml");
		
		myClass mc = context.getBean("mc",myClass.class);
		
		System.out.println(mc.stu0);
		System.out.println(mc.stu1);
		System.out.println(mc.stu2);
		System.out.println(mc.stu3);
		System.out.println(mc.stu4);
		
		System.out.println("============================================================");

		StuColl[] class1 = new StuColl [5];
		  
		for(int i = 0; i<class1.length; i++) { 
			StuColl stu = context.getBean("stu"+i,StuColl.class); 
			stu.calc(); 
			class1[i] = stu; 
		}
		for(int i = 0; i<class1.length; i++) {
			class1[i].rankCalc(class1);
		}
		  
		for(StuColl i : class1) {
			System.out.println(i); 
		}
			 
	
	}
}
