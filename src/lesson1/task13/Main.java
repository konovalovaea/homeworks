package lesson1.task13;

public class Main {
    public static void main(String[] args) {
        System.out.println(format("Казачков Алексей Сергеевич"));
    }

    private static String format(String fio) {
        String surname = null;
        String name = null;

        int num = fio.indexOf(" ");
        surname = fio.substring(0, num);
        fio = fio.substring(num + 1, fio.length());

        num = fio.indexOf(" ");
        name = fio.substring(0, num);


        String namesurname = name + " " + surname;
        return namesurname;
    }
}
