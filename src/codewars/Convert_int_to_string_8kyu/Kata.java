package codewars.Convert_int_to_string_8kyu;
// конвертирует введенное целое число в строку
import java.util.Scanner;

public class Kata {
    public static String ConvertIntToString (int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        String result = ConvertIntToString(x);
        System.out.println(result);
    }
}


