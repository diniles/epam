//Для успешного выполнения задания достаточно реализовать 2-4 пункта.
//Задание. Ввести n чисел с консоли.
//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//2. Вывести числа в порядке возрастания(убывания)значений их длины.
//3. Вывести на консоль те числа, длина которых меньше(больше)средней длины по всем числам, а также длину.
//TODO:4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
//TODO:5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
//TODO:6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
//TODO:7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

package JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Optional1 {
    public static void main(String[] args) {
        int n = 5; //quantity of numbers
        System.out.println("Please enter " + n + " numbers");
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfNumbers = new String[n];
        for (int i = 0; i < n; i++) {
            arrayOfNumbers[i] = scanner.next();
        }

        int arrayOfNumbersLength = arrayOfNumbers.length;

        Arrays.sort(arrayOfNumbers);
        System.out.println("01. Shortest & longer numbers:");
        System.out.print(arrayOfNumbers[0] + " with length " + arrayOfNumbers[0].length() + " ");
        System.out.println(arrayOfNumbers[arrayOfNumbersLength - 1] + " with length " + arrayOfNumbers[arrayOfNumbersLength - 1].length());
        System.out.println();

        System.out.println("02. Print sorted array of numbers");
        for (String arrayOfNumber : arrayOfNumbers) {
            System.out.println(arrayOfNumber);
        }

        System.out.println("03. Numbers with length more than medium element length");
        int mediumLength = 0;
        for (String arrayOfNumber : arrayOfNumbers) {
            mediumLength += arrayOfNumber.length();
        }
        mediumLength /= arrayOfNumbersLength;
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() > mediumLength) {
                System.out.println(arrayOfNumber);
            }
        }
    }
}
