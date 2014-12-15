	/**
	 * Write a program to find the given number (int) is Armstrong number or not?
	 * Armstrong numbers are the sum of their own digits to the power of the number of digits. 
	 * It is also known as narcissistic numbers.
	 * 
	 * 1) input: 371 result: true
	 * 
	 * 2) Input: 523 Result: false​
	 * 
	 * 3) Input: 153 Result: false
	 * 
	 * @param number
	 * @return
	 */
	public boolean isArmstrongNumber(int number) {// LOCK
		int tmp = number, sum = 0, div = 0, noOfDigits = String.valueOf(number).length();
		while (tmp > 0) {
			div = tmp % 10;
			int pow = (int) Math.pow(div, noOfDigits);
			sum += pow; 
			tmp = tmp / 10; //LOCK
		}
		return number == sum;
	}
