package com.hcl.howdy;



public class UserMainCode//Exercise 16
{
	
	public void fillArray(int[] digitArray, int num, int digitLength) {
		if (digitLength == 0) {return;}
		digitArray[(digitLength-1)] = ((num)-(num % (int)(Math.pow(10,(digitLength-1)))))/((int)(Math.pow(10,(digitLength-1))));
		fillArray(digitArray, (num-(int)(Math.pow(10,(digitLength-1)))), (digitLength-1));
	}
	
	public int checkSum(int x) {
		int length = String.valueOf(x).length();
		int digits[] = new int[length];
		
		fillArray(digits, x, length);
		
		int sum = 0;
		for (int j = 0; j < length; j++) {
			if ((digits[j] % 2) != 0) {
				sum = sum + digits[j];
			}
		}
		if (sum % 2 != 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
}