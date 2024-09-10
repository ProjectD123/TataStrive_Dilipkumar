package day7;

import  java
import java.util.Scanner;

public class ArrPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int arrSize = sc.nextInt();
		int size[] = new int[arrSize];
		if (arrSize < 1 || arrSize > 6) {
			System.out.println("please enter valid number!!");
			return;
		}

		for (int i = 0; i < arrSize; i++) {
			System.out.println("Enter the number:");
			int arr1 = sc.nextInt();
			if (arr1 < 0 || arr1 > 100) {
				System.out.println("Enter valid size");
			}

		}

	}

}
