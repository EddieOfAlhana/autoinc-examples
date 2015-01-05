/*
Task:
Check if a string cand be segmented into sequence of dictionary words

Description
Given a string s and a dictionary of words dict, determine if s can be 
segmented into a space-separated sequence of one or more dictionary words.

Interface to be implemented:
public boolean wordBreak(String s, Set<String> dict)

Example:
1) 
Input:
  s = "leetcode",
  dict = ["leet", "code"].

Output:
  true  (because "leetcode" can be segmented as "leet code".)

*/

public boolean wordBreak(String s, Set<String> dict) {
    boolean[] t = new boolean[s.length()+1];
    t[0] = true; 

    for(int i=0; i<s.length(); i++){
        if(!t[i]) {
            continue;
        }

        for(String a: dict){
            int len = a.length();
            int end = i + len; //LOCK
            
            if(end > s.length() || t[end])
            {
                continue;
            }

            if(s.substring(i, end).equals(a)){
                t[end] = true;
            }
        }
    }

    return t[s.length()];
}
