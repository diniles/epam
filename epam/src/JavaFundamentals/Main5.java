//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.
package JavaFundamentals;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yearWord = "";
        System.out.print("Please enter a number from 1 to 12: ");
        int year = sc.nextInt();
        switch (year) {
            case 1:
                yearWord = "January";
                break;
            case 2:
                yearWord = "February";
                break;
            case 3:
                yearWord = "March";
                break;
            case 4:
                yearWord = "April";
                break;
            case 5:
                yearWord = "May";
                break;
            case 6:
                yearWord = "June";
                break;
            case 7:
                yearWord = "July";
                break;
            case 8:
                yearWord = "August";
                break;
            case 9:
                yearWord = "September";
                break;
            case 10:
                yearWord = "October";
                break;
            case 11:
                yearWord = "November";
                break;
            case 12:
                yearWord = "December";
                break;
            default:
                System.out.println("Please enter number from 1 up to 12");
        }
        System.out.println(yearWord);
    }
}
