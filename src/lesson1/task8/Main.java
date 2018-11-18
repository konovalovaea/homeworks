package lesson1.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(-3));
        System.out.println(factorial(0));
    }
// не могу понять, как тут делать с отрицательными числами
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        if (n != n) {
            result = result * (-1);
        }


        return result;
    }

}



