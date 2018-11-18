package lesson3.exception;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Character[] strings = new Character[20];
        fillArray(strings);
        System.out.println(Arrays.toString(strings));

        // необходимо написать метод checkArray() который бы проверил, что в данном массиве содержатся только цифры
        // если оказалось что в массиве оказался другой символ - выбросить исключение
        //      и обработать его в методе main() - вывести в консоль какой элемент не подошёл под условие "только цифры".
        // если проверка прошла то необходимо вывести в консоль что проверка прошла
        try {
            checkArray(strings);
        } catch(ExceptionChar ex) {
            System.out.print("catch the exception " + ex);
        }

    }

    private static void checkArray(Character[] strings) throws ExceptionChar {

        for (int i = 0; i < strings.length; i++) {
            if (!Character.isDigit(strings[i])) {

                System.out.println("эта штука [" + strings[i] + "] не цифра");
                throw new ExceptionChar(strings[i]);

            }
        }
        System.out.print("порядок");
    }

    private static void fillArray(Character[] strings) {
        Random r = new Random();
        String alphabet = "12345s78901";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = alphabet.charAt(r.nextInt(alphabet.length()));
        }
    }
}

class ExceptionChar extends Exception {
    private char detail;

    ExceptionChar(char detail) {
        this.detail = detail;
    }

    public String toString() {
        return "ExceptionChar " + detail;
    }
}