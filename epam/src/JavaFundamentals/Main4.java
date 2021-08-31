//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
package JavaFundamentals;

public class Main4 {
    public static void main(String[] args) {
        System.out.print("Sum of numbers: ");
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("is " + sum);
        System.out.print("Mul of numbers: ");
        int mul = 1;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            mul *= Integer.parseInt(args[i]);
        }
        System.out.println("is " + mul);
    }
}
