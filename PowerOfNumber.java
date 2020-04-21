package com.prasad.test.javaClasses;

import java.util.Scanner;

public class PowerOfNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Long a = sc.nextLong();
		Long b = sc.nextLong();
		int mod = sc.nextInt();
		System.out.println(calcultePower(a, b, mod));

	}

	static long calcultePower(long a, long b, int mod) {
		if (a == 0l)
			return 0l;
		if (a == 1l || b == 0l)
			return 1l;
		if (b == 1l)
			return a;
		long sqr = calcultePower(a, b / 2, mod) % mod;

		sqr = sqr * sqr;
		if (b % 2 != 0) {
			sqr = ((sqr % mod) * (a % mod));
		}
		return sqr % mod;
	}
}
