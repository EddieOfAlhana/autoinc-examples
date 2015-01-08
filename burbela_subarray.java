/**
* Find the largest sum, of a contigounus subarray within an array.
*
* Examples:
* [1,2,3,4,5] -> 15
* [-1,-2,-3,-4,-5] -> -1
* [−2,1,−3,4,−1,2,1,−5,4] -> 6
* [-1, 2, 0, 3, -10, 3, 2, 1, -4 ] -> 6
* [] -> 0
* null -> 0
*
*/
public int maxSumOfSubarrays(final int[] allNumber) {
	if (allNumber == null || allNumber.length == 0) {
		return 0;//FIXED
	}
	int newSum = allNumber[0];
	int max = allNumber[0];// FIXED
	for (int i = 1; i < allNumber.length; i++) {
		newSum = Math.max(newSum + allNumber[i], allNumber[i]);
		max = Math.max(max, newSum);
	}
	return max;
}