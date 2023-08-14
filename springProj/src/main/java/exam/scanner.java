package exam;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] arr = {67,23,45};
		int max = arr[0];
		
		if(max < arr[0]) {
			max = arr[0];
		}else if(max < arr[1]) {
			max = arr[1];
		}else if(max < arr[2]) {
			max = arr[2];
		}
		
		System.out.println(max);
		
	}

}
