package codewars.Convert_boolean_to_string_8kyu;
//конвертирует введенное boolean значение в строку
import java.util.Scanner;

public class Kata {
    public static String YesOrNo (boolean bool) {
        if (bool) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите true или false");
        boolean x = in.nextBoolean();
        String result = YesOrNo(x);

        System.out.println(result);
    }
}
