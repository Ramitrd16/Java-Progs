package String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public 	class Solution{
	
	static List<Character> openBraces = List.of('(','[','{','<');
	static List<Character> closedBraces = List.of(')',']','}','>');
	static Map<Character, Character> map = new HashMap<>();
	public static void main(String[] args){
		String str = "({{{{}}}))";
		System.out.println(isValid(str));
	}
	
	public static boolean isValid(String str){
		map.put(')','(');
		map.put(']','[');
		map.put('}','{');
		map.put('>','<');
		if(str == null || str==""){
			return true;
		}
		
		Stack<Character> st = new Stack<>();
		for(char ch : str.toCharArray()) {

				if (openBraces.contains(ch)) {
					st.push(ch);
				} else if (st.peek().equals(map.get(ch))&& !st.isEmpty()) {
					st.pop();
			} else {
				return false;
			}
		}
		return st.isEmpty();
	}
}
