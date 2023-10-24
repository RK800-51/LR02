package lr2;

import java.util.Scanner;
// проверяет, сколько тысяч в введенном числе
public class Task5 {
    public static int countThousands (int number) {
        number /= 1000;
        return number;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        int result = countThousands(x);

        System.out.println(result);
    }
}
