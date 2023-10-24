package lr2;

import java.util.Scanner;
// проверяет, делится ли число на 4 и при этом оно не меньше 10
public class Task3 {
    public static String divideBy4 (int number) {
        if (number % 4 == 0 && number >= 10) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        String result = divideBy4(x);

        System.out.println(result);
    }
}