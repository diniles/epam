//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
package JavaFundamentals;

public class Main3 {
    public static void main(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            System.out.print(args[i]);
        }
        for (int i = 0; i <= args.length - 1; i++) {
            System.out.println(args[i]);
        }
    }
}
