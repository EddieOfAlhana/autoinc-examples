/*
Task:
Convert decimal to to binary

Description:
Write a program to convert not negative decimal number to binary format using numeric operations.

Interface to be implemented:
public void printBinaryFormat(int number)

Examples:
1)
input: 0
output: 0
 
2) 
input: 1
output: 1
 
3) 
input: 2
output: 10
 
4) 
input: 9
output: 1001
*/
	
public void printBinaryFormat(int number){
    int binary[] = new int[25];	//LOCK
    int index = 0;        
    if (number == 0) { 	
        binary[1] = 0; //LOCK
        index = 1;
    }
    while(number > 0){
        binary[index++] = number%2;
        number = number/2;
    }
    for(int i = index-1;i >= 0;i--){
        System.out.print(binary[i]);
    }
}
