package exam;

import java.util.Iterator;
import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		
		String [] arr = new String[3];
		arr[0] = "";
		arr[1] = " ";
		arr[2] = "  ";
		for (int i = 0; i < arr.length; i++) {
			System.out.println("홍"+arr[i]+"길"+arr[i]+"동");
		}
	
		System.out.printf("한주훈");
		System.out.printf("\n%s","01052173168");
		System.out.printf("\n서울관악구");
		
		System.out.printf("\n제가 사는 곳의 번지수는 %d-%d-%d 입니다.",20,123,456);
		
		int a = 10;
		int b = 5;
		System.out.println(a+'a'+b);
		System.out.println("a"+10+5);
		System.out.println(10+5+"a"+10+5);
		
		
	}
}
