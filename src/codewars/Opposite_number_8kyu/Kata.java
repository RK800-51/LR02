package codewars.Opposite_number_8kyu;
// возвращаем противоположное по знаку число, введенное с клавиатуры
import java.util.Scanner;

public class Kata {
    public static int OppositeNumber (int num) {
        return -num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        int result = OppositeNumber(x);
        System.out.println(result);
    }
}
