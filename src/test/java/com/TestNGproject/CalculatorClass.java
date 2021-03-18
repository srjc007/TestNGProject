package com.TestNGproject;

public class CalculatorClass {
	
	public int add(int ...n){
		int sum = 0;		
		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		return sum;
	}
	
	public int multiply(int ...n){
		int prod = 1;		
		for (int i = 0; i < n.length; i++) {
			prod = prod * n[i];
		}
		return prod;
	}
	
	

}
