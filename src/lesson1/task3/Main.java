package lesson1.task3;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Олег", "Денис", "Маша", "Даша", ""};

        for (int i = 0; i < array.length; i++) {
            sayHello(array[i]);
        }

    }
    private static void sayHello(String name) {
        System.out.println("Привет " + name + "!");
    }
    }