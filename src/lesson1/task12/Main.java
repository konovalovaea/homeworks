package lesson1.task12;

/**
 * Напишите метод который принимает математическое выражение в формате String и возвращает результат.
 * В выражении используются только целые числа, поддерживаемые операции:+,-.
 * Пример:
 * 	math("2-1"); // вернёт [1]
 * 	math("2- +1"); // вернёт [1]
 * 	math(" 2-  -1"); // вернёт [3]
 */
public class Main {
public static void main (String args[]){
     System.out.print(Function("2-1"));
     System.out.print(Function("2- +1"));
     System.out.print(Function("2-  -1"));
}

    private static Integer Function(String str) {
     int i = 0;
     int num = 0;
     boolean isNeg = false;

        if (str.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }

        while( i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0';
        }

        if (isNeg)
            num = -num;
        return num;
    }



}
