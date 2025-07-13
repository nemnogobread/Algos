import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticPasringToolApp {
    public static void main(String[] args) throws IOException {
        {
            String input, output;
            int result;
            while(true)
            {
                System.out.print("Enter infix: ");
                System.out.flush();
                input = getString();         // Чтение строки с клавиатуры
                if(input.isEmpty())       // Выход, если нажата клавиша [Enter]
                    break;
                // Создание объекта-преобразователя
                ArithmeticParsingTool theTrans = new ArithmeticParsingTool(input);
                output = theTrans.reformatToPostfixString(); // Преобразование
                result = theTrans.computePostfixString();
                System.out.println("Postfix is " + output);
                System.out.println("Result is " + result + '\n');
            }
        }
    }

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}