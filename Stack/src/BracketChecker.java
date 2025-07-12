public class BracketChecker {
    private String input;
    public  BracketChecker(String in){
        input = in;
    }

    public boolean check(){
        int stackSize = input.length();
        MyCharStack myCharStack = new MyCharStack(stackSize);

        char[] charArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++){
            char temp = charArray[i];
            switch (temp){
                case '(':
                case '{':
                case '[':
                    myCharStack.push(temp);
                    break;

                case ')':
                    if (!myCharStack.isEmpty() && myCharStack.peek() == '('){
                        myCharStack.pop();
                        break;
                    } else return false;
                case '}':
                    if (!myCharStack.isEmpty() && myCharStack.peek() == '{'){
                        myCharStack.pop();
                        break;
                    } else return false;
                case ']':
                    if (!myCharStack.isEmpty() && myCharStack.peek() == '['){
                        myCharStack.pop();
                        break;
                    } else return false;
                default:
                    break;
            }
        }
        if (!myCharStack.isEmpty())
            return false;

        return true;
    }
}
