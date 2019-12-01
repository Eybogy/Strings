import java.util.Scanner;

//Программа, которая по введенной строке вычисляет последнее слово максимальной длины.

public class Three {
    Scanner in = new Scanner(System.in);
    int ID, max = 0, length = 0, LastID = 0, FirstID = 0;
    String space = " ";
    char[] Main = in.nextLine().toCharArray();     // Вводим строку и превращаем её в массив символов
    public void Three(){
        for (int i = 0; i < Main.length;i++){
            if(Main[i] != space.charAt(0)){
                length++;
                ID = i;
                if(max <= length){
                    max = length;
                    LastID = ID;
                    FirstID = LastID - length + 1;
                }
            }
            else if(Main[i] == space.charAt(0)){
                length = 0;
            }
        }
        for(int i = FirstID; i <= LastID; i++){
            System.out.print(Main[i]);
        }
    }
}