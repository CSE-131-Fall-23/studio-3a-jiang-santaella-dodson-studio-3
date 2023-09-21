package studio3;

import java.util.Scanner;

public class Sieve {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the value for n:");
	        int n = scanner.nextInt();

	       
	        boolean[] sieve = new boolean[n + 1];
	        for (int i = 0; i <= n; i++) {
	            sieve[i] = true;
	        }

	        
	        sieve[0] = false;
	        sieve[1] = false;

	        
	        for (int i = 2; i * i <= n; i++) {
	            
	            if (sieve[i] == true) {
	                
	                for (int j = i * i; j <= n; j = j + i) {
	                    sieve[j] = false;
	                }
	            }
	        }

	       for(int i = 2; i <= n; i++) {
	    	   if (sieve[i] == true) {
	    	   System.out.println(i);}}
	       }
	 
	    }
	