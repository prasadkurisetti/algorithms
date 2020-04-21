package com.prasad.test.javaClasses;

import java.util.Arrays;
import java.util.Scanner;

public class Tribonacci {
	static int MOD = (int) (1e9 + 7);
	static Scanner sc = new Scanner(System.in);
	static int dp[] = new int[1001];

	static int modAdd(int a, int b) {
		return (a % MOD + b % MOD) % MOD;
	}

	public static void main(String[] args) {
		Arrays.fill(dp, -1);
		
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		for(int i=3;i<=1000;i++) {
			dp[i]=modAdd(modAdd(dp[i-3],dp[i-2]),dp[i-1]);
		}
		int testCases = sc.nextInt();
		while(testCases--!=0) {
			System.out.println(dp[sc.nextInt()]);
		}
		
		
	}
}
