// Вычисляет количество слов, начинающихся с гласной буквы

import java.util.ArrayList;
import java.util.Scanner;

public class One {
    Scanner in = new Scanner(System.in);
    int All = 0;
    String space = " ";
    String s = "AaEeIiOoUuYy";
    char[] a = in.nextLine().toCharArray();
    ArrayList<Character> symbols = new ArrayList<>();
    public void One() {
        symbols.add(space.charAt(0));
        for (int i = 0; i < a.length; i++) {
            symbols.add(a[i]);
        }
        for (int i = 1; i < a.length; i++) {
            if (symbols.get(i-1) == space.charAt(0)) {
                for (int j = 0; j < 12; j++) {
                    if (symbols.get(i) == s.charAt(j)){
                        All++;
                    }
                }
            }
        }
        System.out.println("Слов, насинающихся на гласную:" +"\n" + All);
    }
}