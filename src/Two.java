//Программа, которая по введенной строке вычисляет номера слов, имеющих длину 3.

import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    Scanner in = new Scanner(System.in);
    int All = 1;
    int length = 0;
    String space = " ";
    ArrayList<Integer> input = new ArrayList<>();
    char[] a = in.nextLine().toCharArray();
    public void Two(){
        for(int i = 0; i<a.length-1; i++){
            if (a[i] != space.charAt(0)){
                length++;
                if (length == 3 && a[i+1] == space.charAt(0)){
                    input.add(All);
                }
            }
            if(a[i] == space.charAt(0)) {
                length = 0;
                All++;
            }
        }
        // проверка последних трёх знаков на вхождение
        if (a[a.length-1] != space.charAt(0) && a[a.length-2] != space.charAt(0) && a[a.length-3] != space.charAt(0)){
            if (a.length > 3 && a[a.length-4] == space.charAt(0)){
                input.add(All);
            }
        }
        System.out.println("Номера слов длины 3: ");
        for(int i = 0; i < input.size(); i++){
            System.out.println(input.get(i));
        }
    }
}