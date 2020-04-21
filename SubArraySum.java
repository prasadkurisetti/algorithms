package com.prasad.test.javaClasses;

import java.util.Scanner;

public class SubArraySum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int testCases = sc.nextInt();
		while (testCases-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int queries = sc.nextInt();
			for (int i = 0; i < queries; i++) {
				System.out.print(countSubSeq(0, sc.nextInt(), 0, arr, n) + " ");
			}
			System.out.println();
		}

	}

	static int countSubSeq(int i, int sum, int cnt, int a[], int n) {
		if (i == n) {
			if (sum == 0 ) {
				return 1;
			} 
				return 0;
			
		}
		
		return countSubSeq(i + 1, sum, cnt, a, n)+countSubSeq(i + 1, sum - a[i], cnt + 1, a, n);
	}

}