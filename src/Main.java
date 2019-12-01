import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - задание 1, 2 - задание 2, 3 - задание 3");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("Введите первое число");
            int n1 = in.nextInt();
            System.out.println("Введите второе число");
            int n2 = in.nextInt();
            //System.out.println(One.count(n1, n2));
        } else if (x == 2) {
            System.out.println("Введите первое число");
            int a = in.nextInt();
            System.out.println("Введите второе число");
            int n = in.nextInt();
            //System.out.println(Two.count(a, n));
        } else if (x == 3) {
            Three c = new Three();
            c.Three();
        }
    }
}
