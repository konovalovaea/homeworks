package lesson1.task5;

public class Main {
    public static void main(String args[]) {
        System.out.println(mask("85632983256"));
        System.out.println(mask("56"));
        System.out.println(mask("3"));
        System.out.println(mask(""));
        System.out.println(mask("ierfu"));
    }

    private static String mask(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i >= str.length() - 2) {
                //Метод append() — обновляет значение объекта,
                // который вызвал метод. Этот метод в Java принимает boolean, char, int, long, Strings и т.д.
                //Метод charAt() — возвращает символ, расположенный
                // по указанному индексу строки. Индексы строк в Java начинаются с нуля.
                // вытащено из недр http://proglang.su/java
                sb.append(str.charAt(i));
            } else {
                sb.append("#");
            }
        }
        //Метод toString() — в Java метод преобразует и возвращает строку.
        return sb.toString();
    }
}