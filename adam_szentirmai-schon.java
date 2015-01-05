/*
 * Task: Properly nested paretheses
 * Description: 
 * A String s is properly nested, if:
 *      s is empty, or
 *      s has the form of "(U)", or "[U]", or "{U}", , or
 *      s has the form of UV
 *      (where U, V are also properly nested strings)
 * Write a method that returns 1, it its argument String is properly nested, return 0 otherwise!
 *    
 * Interface to be implemented:
 * public int solution(final String S)
 * 
 * Examples:
 *      1)
 *      Input: "{[()()]}"; Result: 1; 
 *      2)
 *      Input: "}{}[[]]()"; Result: 0;
 *      3)
 *      Input: "{[()()]})]"; Result: 0;
 */
	public boolean isProperlyNested(final String str) {
		Map<Character, Character> pairs = new HashMap<>();
		pairs.put('(', ')'); // LOCK
		pairs.put('[', ']'); // LOCK
		pairs.put('{', '}');
		Deque<Character> stack = new ArrayDeque<>();
		for (char symbol : str.toCharArray()) {
			if (pairs.containsKey(symbol)) {
				stack.push(pairs.get(symbol));
			} else {
				if (stack.size() < 1 || symbol != stack.poll()) {
					return false;
				}
			}
		}
		return stack.size() == 0;
	}
}
