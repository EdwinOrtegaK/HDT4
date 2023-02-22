import java.util.Stack;

public class InfToPostfix {
    public String convert(String infix){
        String postfix = "";
        Stack<String> vapo = new Stack<String>();
        for (int i = 0; i<infix.length(); i++){
            boolean Num = false;
            try {
                Integer.parseInt(infix.charAt(i)+"");
                Num = true;
            } catch (Exception e){}
            if (Num){
                postfix += infix.charAt(i);
            } else if (infix.charAt(i) == '+' || infix.charAt(i) == '-' || infix.charAt(i) == '*' || infix.charAt(i) == '/') {
                vapo.push(infix.charAt(i)+"");
            } else if (infix.charAt(i) == '(') {
                vapo.push("(");
            } else if (infix.charAt(i) == ')') {
                while (!vapo.isEmpty() && vapo.peek() != "("){
                    postfix += vapo.pop();
                }
                vapo.pop();
            }
        }
        while (!vapo.isEmpty()){
            postfix += vapo.pop();
        }
        return postfix;
    }
}