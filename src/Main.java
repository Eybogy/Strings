import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - задание 1, 2 - задание 2, 3 - задание 3");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 1) {
            One a = new One();
            a.One();
        } else if (x == 2) {
            Two b = new Two();
            b.Two();
        } else if (x == 3) {
            Three c = new Three();
            c.Three();
        }
    }
}
