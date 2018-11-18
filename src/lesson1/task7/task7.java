package lesson1.task7;

public class task7 {
    public static void main(String args[]) {
        System.out.println(latterdouble("Актива"));
        System.out.println(latterdouble("Мышь"));
        System.out.println(latterdouble("Кродеться"));
    }
    static boolean latterdouble(String a)  {
        String doubles = "";
        for (int i = 0; i < a.length(); i++) {
            String s = a.substring(i, i + 1);
            //Метод substring() в Java имеет два варианта и возвращает новую строку,
            // которая является подстрокой данной строки. Подстрока начинается с символа,
            // заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.
            if (doubles.contains(s.toLowerCase())) {
                //toLowerCase преобразует все символы в данной строки в нижний регистр
                return true;
            } else {
                doubles += s.toLowerCase();
            }
        }
        return false;
    }
}
