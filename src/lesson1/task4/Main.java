package lesson1.task4;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 3, 2, 5};
        int n = input.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (input[j] != input[i]) {
                    if (m != j) input[m] = input[j];
                    m++;
                }
            }
        }


        if (n != input.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = input[i];

            input = b;
        }

        for (int x : input) System.out.print(x + " ");
        System.out.println();
    }
}
