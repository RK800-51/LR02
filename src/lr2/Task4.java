package lr2;

import java.util.Scanner;
// проверяет, попадает ли введенное число в диапазон от 5 до 10 включительно
public class Task4 {
    public static String between5And10 (int number) {
        if (number >= 5 && number <= 10) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        String result = between5And10(x);

        System.out.println(result);
    }
}
