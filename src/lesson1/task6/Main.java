package lesson1.task6;

public class Main {
    public static void main(String[] args){
        System.out.println(negative(3));
        System.out.println(negative(3));
        System.out.println(negative(-12));
    }

    private static int negative(int i) {
        return i < 0 ? i : -i;
    }

}
