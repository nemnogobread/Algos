/*
Разложение на простые множители
Вывести разложение натурального числа n на простые множители. Простые множители должны быть упорядочены по возрастанию
и разделены пробелами. 2 ≤ n ≤ 106.
 */

import java.util.LinkedList;
import java.util.stream.IntStream;

public class PrimeFactorization {
    public static LinkedList<Integer> createPrimeArray(int n){
        LinkedList<Integer> primeList = new LinkedList<>();
        int[] primeArray = IntStream.range(0, n).toArray();
        for (int i = 2; i < primeArray.length; i++){
            if (primeArray[i] != -1){
                primeList.add(primeArray[i]);
                for (int j = i + i; j < primeArray.length; j += i){
                    primeArray[j] = -1;
                }
            } else {
                continue;
            }
        }

        return primeList;
    }

    public static LinkedList<Integer> solution(int value) {
        LinkedList<Integer> primeList = createPrimeArray(value);
        LinkedList<Integer> result = new LinkedList<>();
        int i = 0;
        while (value > 1){
            int temp = primeList.get(i);
            if (value % temp == 0){
                result.add(temp);
                value /= temp;
            } else {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(75));
    }
}
