package DSA.stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(infixPostfix("(a+b)*d-(a*b)/f"));
        String x2 ="a";
        
        System.out.println(x2.equals(x2));
	}
	
	public static String infixPostfix(String str) {
		String ans = new String();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char x=str.charAt(i);
//			System.out.println(st);
			if((x>='a' && x<='z')){
				
				ans+=x;
			}
			else if(x=='(') {
				st.push(x);
			}
            else if(x==')') {
				while(st.peek()!='(') {
					ans+=st.pop();
				}
				st.pop();
			}
            else{
            	
            	 while( !st.isEmpty() && st.peek()!='(' && checkPriority(x)<=checkPriority(st.peek())) {
            			ans+=st.pop();
            		}
            		st.push(x);
            	}

				
			
		}
		System.out.println(st);
		while(!st.isEmpty()) {
		ans+=st.pop();
	}
		return ans;
		
	}

	private static int checkPriority(Character k) {
		// TODO Auto-generated method stub
		switch(k){
        case '+':
        
        case '-':
        return 1;
        case '*':
       
        case '/':
        return 2;
        case '^':
        return 3;

    }
//		if(k == '^')
//            return 3;
//        else if(k == '/' || k == '*')
//            return 2;
//        return 1;
		return 0;
		
	}

}
