/*
Description:  Check if a number is perfect. A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself. 
The first perfect number is 6, because 1, 2 and 3 are its proper positive divisors, and 1 + 2 + 3 = 6. 

Examples:
1)
input: 6
output: true
 
2) 
input: 0
output: false
 
3) 
input: 5
output: false
 
4) 
input: -1
output: false
*/
	
public boolean isPerfectNumber(int number){
   boolean isPositive = number > 0; //LOCK
   int sum = 0;
   for( int i = 1; i <= number/2; i++){
      if(number % i == 0) {
          sum += i;
       }
    }
   return isPositive && number == sum;
}

