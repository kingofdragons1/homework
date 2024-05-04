import java.util.Scanner;
import java.lang.Math;

public class Two {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a % 5 == 0) System.out.println("a=" + a);
        if (b % 5 == 0) System.out.println("b=" + b);
        if (c % 5 == 0) System.out.println("c=" + c);
        if (a % 5 != 0 && b % 5 != 0 && c % 5 != 0) System.out.println("нет значений, кратных 5");

        System.out.println("Целочисленное деление a на b: " + a / b);

        System.out.println("Деление a на b: " + (double) a / b);

        System.out.println("Деление a на b, округленное вверх: " + Math.ceil((double) a / b));

        System.out.println("Деление a на b, округленное вниз: " + Math.floor((double) a / b));

        System.out.println("Деление a на b, округленное математически: " + Math.round((double) a / b));

        System.out.println("Остаток от деления b на c: " + b % c);

        System.out.println("Наименьшее из a и b: " + Math.min(a, b));

        System.out.println("Наибольшее из b и c: " + Math.max(b, c));
    }
}
