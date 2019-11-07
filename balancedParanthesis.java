import java.util.Stack;
public class balancedParanthesis {

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
                //System.out.println(s.charAt(i));
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}') {
                //System.out.println("Debug 1 "+ stack.peek());
                if(stack.empty()){
                    return false;
                }
                else if (stack.pop()!='{')
                return false;
            }
            else if(s.charAt(i)==')') {
                //System.out.println("Debug 2 "+ stack.peek());
                if(stack.empty()){
                    return false;
                }
                else if (stack.pop()!='(')
                    return false;
            }
            else if(s.charAt(i)==']') {
                //System.out.println("Debug 3 "+ stack.peek());
                if(stack.empty()){
                    return false;
                }
                else if (stack.pop()!='[')
                    return false;
            }
        }
        if(!stack.empty()){
            return false;
        }

        return true;
    }

    public static String correctIfNotBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
                //System.out.println(s.charAt(i));
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}') {
                //System.out.println("Debug 1 "+ stack.peek());
                if (stack.pop()!='{'){}

            }
            else if(s.charAt(i)==')') {
                //System.out.println("Debug 2 "+ stack.peek());
                if (stack.pop()!='(')
                    return s;
            }
            else if(s.charAt(i)==']') {
                System.out.println("Debug 3 "+ stack.peek());
                if (stack.pop()!='[')
                    return s;
            }
        }
        return s;
    }

    public static void main(String... args){
        String s="([{}])";
        //System.out.println("For the string " + s + " : " + isBalanced(s));
        s = "([{})";
        //System.out.println("For the string " + s + " : " + isBalanced(s));
        s = "]";
        System.out.println("For the string " + s + " : " + isBalanced(s));


    }
}
