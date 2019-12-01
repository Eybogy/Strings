//Программа, которая по введенной строке вычисляет номера слов, имеющих длину 3.

import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    public class Length3 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int check = 0;
            int count = 1;
            int schet = 0;
            ArrayList<Integer> save = new ArrayList<>();
            System.out.println("Ввод строки тут: ");
            char[] a = in.nextLine().toCharArray();
            for(int i = 0; i<a.length;i++){
                String c = " ";
                if(a[i] != c.charAt(0)){
                    schet++;
                }
                else if(i+1 < a.length){
                    if(a[i] == c.charAt(0) && a[i+1] != c.charAt(0)){
                        count++;
                        if(check++ == 0 && a[i-2] == c.charAt(0)){
                            count--;
                        }
                        schet = 0;
                    }
                }
                if(i+1 < a.length){
                    if(schet == 3 && a[i+1] == c.charAt(0)){
                        save.add(count);
                    }
                }
                else if(i+1 == a.length){
                    if(schet == 3){
                        save.add(count);
                    }
                }
            }
            System.out.println("Номера слов, длина которых равна 3: ");
            for(int i = 0; i < save.size(); i++){
                System.out.println(save.get(i));
            }
        }
    }
}
