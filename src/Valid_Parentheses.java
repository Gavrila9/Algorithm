import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        System.out.println(s.length());
        if(s.length()<2){
            return false;
        }
        int leftSmallBracket=0, rightSmallBracket=0, leftMidBracket=0, rightMidBracket=0, leftLargeBracket=0, rightLargeBracket=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)) {
                case '(':
                    leftSmallBracket++;
                    break;
                case ')':
                    rightSmallBracket++;
                    break;
                case '[':
                    leftMidBracket++;
                    break;
                case ']':
                    rightMidBracket++;
                    break;
                case '{':
                    leftLargeBracket++;
                    break;
                case '}':
                    rightLargeBracket++;
                    break;
            }
        }
        if(leftSmallBracket!=rightSmallBracket || leftMidBracket!=rightMidBracket || leftLargeBracket!=rightLargeBracket){
            return false;
        }
        return true;
    }

    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()<2){
            return false;
        }
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c==')'||c==']'||c=='}'){
                stack.push(c);
            }
            else if(stack.isEmpty()){
                return false;
            }else if((stack.peek().equals(')')&&c=='(') || (stack.peek().equals(']')&&c=='[') || (stack.peek().equals('}')&&c=='{')){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Valid_Parentheses valid_parentheses = new Valid_Parentheses();
        System.out.println(valid_parentheses.isValid1("({[)"));
    }
}
