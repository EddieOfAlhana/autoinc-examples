/*
Given an array of integers as a parameter. 
Find the 2nd highest value in the array. 

Interface to be implemented:
public Integer secondMax(int[] array)

Examples:
1) input: [6, -1, 3] result: 3    
2) input: [2, 2, 1] result: 1  
3) input: [-1] result: null 	
4) input: [1, 1, 1]  result: null

*/

public Integer secondMax(int[] array) { //LOCKED
	Integer max = null;
	Integer max2 = null;
	if (array != null && array.length > 1) {
		for (int current : array) { //LOCKED
			if (max == null || max < current) {
				max2 = max;
				max = current;
			} else if ((max2 == null || max2 < current) && current != max) {
				max2 = current;
			}

		}
	}
	return max2;
}
