package lr2;
// проверяем, делится ли введеное число на 3

import java.util.Scanner;

public class Task1 {
    public static String divideBy3 (int number) {
        if (number % 3 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        String result = divideBy3(x);

        System.out.println(result);
    }

}
