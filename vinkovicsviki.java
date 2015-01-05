/*
Task: 
Convert binar to decimal

Description:
Write a program to convert binary format to decimal number using numeric operations.

Interface to be implemented:
public int getDecimalFromBinary(int binary)
     
Examples: 
	1) 
	input: 0 
	output: 0 
	2) 
	input: 11 
	output: 3 
	3) 
	input: 110
	output: 6 
	4) 
	input: 100110 
	output: 1023
     */
    
    public int getDecimalFromBinary(int binary) {

        int decimal = 0;// lock
        int power = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int tmp = binary % 10;
                decimal += tmp * Math.pow(2, power);// lock
                binary = binary / 10;
                power++;
            }
        }
        return decimal;
    }
