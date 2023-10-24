package lr2;

import java.util.Scanner;
// проверяет, дает ли число при делении на 5 остаток 2 и при делении на 7 остаток 1
public class Task2 {
    public static String divideBy5And7 (int number) {
        if (number % 5 == 2 && number % 7 == 1) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        String result = divideBy5And7(x);

        System.out.println(result);
    }
}
