package exam;

import java.util.Random;
import java.util.Scanner;

public class tset2 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int min=0;
		int max=0;
		System.out.println("숫자5개입력");
		for (int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i]<min) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("합계"+sum);
		System.out.println("최소"+min);
		System.out.println("최대"+max);
	}
}