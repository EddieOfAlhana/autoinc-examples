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

public int solution(final String S) {
    char[] input = S.toCharArray(); //LOCK
    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < input.length; i++) {
        char ch = input[i];
        switch (ch) { //LOCK
            case '(': //LOCK
            case '[': //LOCK
            case '{': //LOCK
                stack.addFirst(ch);
                break;
            case ')': //LOCK
                if (!(stack.size() > 0 && '(' == stack.pop())) {
                    return 0;
                }
                break;
            case ']': //LOCK
                if (!(stack.size() > 0 && stack.pop() == '[')) {
                    return 0;
                }
                break;
            case '}': //LOCK
                if (!(stack.size() > 0 && stack.pop() == '{')) {
                    return 0;
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid input");
                }
        }//LOCK
    return stack.size() == 0 ? 1 : 0;
    }
}
