    /*
     * Task: 
     * Find the sum of digits recusively
     *
     * Description:
     * Write a recursive program to find the sum of each digit in the given number.
     * 
     * Interface to be implemented:
     * public static Integer sumOfDigits(final int number)
     *
     * Examples:
     * 1) Input: 9; 
     *    Result: 9; 
     * 2) Input: -13; 
     *    Result: 4;
     * 3) Input: 12; 
     *    Result: 3; 
     * 4) Input: 12345 
     *    Result: 15 
     * 5) Input: -12345 
     *    Result: 15
     */
    public static Integer sumOfDigits(final int number) {
        return //
        (number != 0) //
        ? //
        Math.abs(number % 10) //LOCK
        + //
        sumOfDigits(number / 10)//
        : //
        number;
    }

    /*
     * Task: 
     * Find the sum of digits non-recusively
     *
     * Description:
     * Write a non-recursive program to find the sum of each digit in the given number.
     * 
     * Interface to be implemented:
     * public static Integer sumOfDigitsNonRecursive(int number)
     *
     * Examples:
     * 1) Input: 9; 
     *    Result: 9; 
     * 2) Input: -13; 
     *    Result: 4;
     * 3) Input: 12; 
     *    Result: 3; 
     * 4) Input: 12345 
     *    Result: 15 
     * 5) Input: -12345 
     *    Result: 15
     */

    public static Integer sumOfDigitsNonRecursive(int number) {
        number = Math.abs(number);
        int sum = 0; //LOCK
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
