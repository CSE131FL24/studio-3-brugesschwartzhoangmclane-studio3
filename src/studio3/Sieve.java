package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");		
		int n = in.nextInt();
		int[] sieve = new int[n-1];
		boolean[] prime = new boolean[n-1];
		for (int i = 0; i < n-1; i++) {
			sieve[i] = i+2;
			System.out.println(sieve[i]);
			
			prime[i] = true;
			System.out.println(prime[i]);
			
		}
		
		for (int i=0; i < n-1; i++) {
			int position = i;
			if (prime[i] == true) {
				for (int j = 2 * (position + 2); j < n; j+= position + 2) {
					prime[j - 2] = false;
					System.out.println((position + 2) + "" + prime[j-2]);
				}
			}
		}
		
		
		
		
		

	}

}
