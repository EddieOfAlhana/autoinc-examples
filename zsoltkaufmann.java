    /*
	Reverse words in a string
	
	Description:
	Given an input string, reverse the string word by word.
	
	Examples:
	
	1)
	input: 	"the sky is blue"
	output:	"blue is sky the"
	
	2)
	input: 	"the cake is a lie"
	output: "lie a is cake the"
     */
    
    public String reverseWords(String s) {
	if (s == null || s.length() == 0) {
	    return "";
	}
	String[] arr = s.split(" "); // LOCKED
	StringBuilder sb = new StringBuilder(); 
	for (int i = arr.length - 1; i >= 0; --i) {
	    if (!arr[i].equals("")) {
		sb.append(arr[i]).append(" ");
	    }
	}
	return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
