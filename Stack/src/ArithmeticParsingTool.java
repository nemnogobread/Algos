import java.util.Stack;

public class ArithmeticParsingTool {
    private String input;
    private Stack<Character> opers;
    private String output;

    private int result;

    public ArithmeticParsingTool(String input) {
        this.input = input;
        this.output = "";
        this.opers = new Stack<>();
    }

    public String reformatToPostfixString(){
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            switch (ch){
                case '+':
                case '-':
                    getOper(ch, 1);
                    break;
                case '*':
                case '/':
                    getOper(ch, 2);
                    break;
                case '(':
                    opers.push('(');
                    break;
                case ')':
                    getParen(ch);
                    break;

                default:
                    output = output + ch;
            }
        }
        while (!opers.empty()){
            char ch = opers.pop();
            output = output + ch;
        }
        return output;
    }

    private void getOper(char opCur, int prior1){
        while (!opers.empty()){
            char opTop = opers.pop();
            if (opTop == '('){
                opers.push(opTop);
                break;
            } else {
                int prior2 = (opTop == '+' || opTop == '-') ? 1 : 2 ;
                if (prior2 < prior1){
                    opers.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        opers.push(opCur);
    }

    private void getParen(char ch){
        {
            while (!opers.empty()){
                char chx = opers.pop();
                if (chx == '('){
                    break;
                } else {
                    output = output + chx;
                }
            }
        }
    }

    public int computePostfixString(){
        String s = this.output;
        Stack<Integer> values = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case '+':
                    values.push(values.pop() + values.pop());
                    break;
                case '-':
                    int val1 = values.pop();
                    values.push(values.pop() - val1);
                    break;
                case '*':
                    values.push(values.pop() * values.pop());
                    break;
                case '/':
                    int val2 = values.pop();
                    values.push(values.pop() / val2);
                    break;
                default:
                    values.push((int) (ch - '0'));
            }
        }
        return values.pop();
    }
}
