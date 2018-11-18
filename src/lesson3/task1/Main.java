package lesson3.task1;

public class Main {
    public static void main(String[] args) {
        // Напишите один единственый метод который бы умел складывать все чиловые типы данных
        Double aDouble = 10.2D;
        Float aFloat = 7.8F;
        Long aLong = 12L;
        Integer integer = 10;
        Short aShort = 12;
        Byte aByte = 127;

        System.out.println(Doublecalc(aFloat, aDouble));
        System.out.println(Doublecalc(integer, aLong));
        System.out.println(Doublecalc(aShort, aByte));
    }
    private static Double Doublecalc(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }
}

