/*
	Task:
		Find possible index of value in a sorted array

	Description:
		Given a sorted array and a target value, return the index if the target is found. 
		If not, return the index where it would be if it were inserted in order. 
		You may assume no duplicates in the array.
		
	Interface to be implemented:
		public int searchInsert(int[] A, int target)
	
	Examples:
	
		1)
			Input:
				[1,3,5,6]
			    target: 5
			Output:
				2
		2)
			Input:
			    null
			    target: 2
			Output:
				0
		3)
			Input:
			    [1,3,5,6]
			    target: 7
			Output:
				4
		4)
			Input:
			    [1,3,5,6]
			    target: 0
			Output:
				0
*/
    public int searchInsert(int[] A, int target) {
        if(A==null||A.length==0){
        	return 0;
        }
        return searchInsert(A,target,0,A.length-1);
    }
    public int searchInsert(int[] A, int target, int start, int end){ //LOCK
        int mid=(start+end)/2;
        if(target==A[mid]){
        	return mid;
        }else if(target<A[mid]){ //LOCK
        	return ((start<mid) ? searchInsert(A,target,start,mid-1) : start);
        }else{
        	return ((end>mid) ? searchInsert(A,target,mid+1,end) : (end+1));
        }
    }
