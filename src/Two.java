//Программа, которая по введенной строке вычисляет номера слов, имеющих длину 3.

import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    Scanner in = new Scanner(System.in);
    int All = 1;
    int length = 0;
    String space = " ";
    ArrayList<Character> Array = new ArrayList<>();
    ArrayList<Integer> input = new ArrayList<>();
    public void Two(){
        System.out.println("Введите строку");
        char[] a = in.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            Array.add(a[i]);
        }
        Array.add(space.charAt(0));
        for(int i = 0; i<a.length; i++){
            if (Array.get(i) != space.charAt(0)){
                length++;
                if (length == 3 && Array.get(i+1) == space.charAt(0)){
                    input.add(All);
                }
            }
            if(a[i] == space.charAt(0)) {
                length = 0;
                All++;
            }
        }

        System.out.println("Номера слов длины 3: ");
        if (input.size() != 0){
            for(int i = 0; i < input.size(); i++) {
                System.out.println(input.get(i));
            }
        } else {
            System.out.println("0");
        }
    }
}